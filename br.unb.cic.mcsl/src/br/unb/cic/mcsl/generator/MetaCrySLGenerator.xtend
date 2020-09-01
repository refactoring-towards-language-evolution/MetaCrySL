/*
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.generator

import br.unb.cic.mcsl.MetaCrySLStandaloneSetup
import br.unb.cic.mcsl.metaCrySL.Configuration
import br.unb.cic.mcsl.metaCrySL.Model
import com.google.inject.Inject
import java.io.FileReader
import java.nio.file.Files
import java.nio.file.Paths
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import org.eclipse.xtext.parser.IParseResult
import org.eclipse.xtext.parser.IParser
import br.unb.cic.mcsl.metaCrySL.Refinement
import br.unb.cic.mcsl.metaCrySL.Spec
import java.util.HashMap;
import java.util.ArrayList
import java.util.Optional
import org.eclipse.emf.ecore.EObject
import br.unb.cic.mcsl.metaCrySL.impl.MetaCrySLImpl
import br.unb.cic.mcsl.metaCrySL.MetaCrySL

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MetaCrySLGenerator extends AbstractGenerator {

	@Inject
	private IParser parser;
	
	// hashmap to associate each SPEC to a merged set of refinements
	private HashMap<String, ArrayList<String>> specRefs = new HashMap<String, ArrayList<String>>
	// list with all refs to be parsed
	private ArrayList<String> refs = new ArrayList<String>
	val specs = new ArrayList<Spec>
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
//		fsa.generateFile('greetings.txt', 'People to greet: ' + 
//			resource.allContents
//				.filter(Greeting)
//				.map[name]
//				.join(', '))
	}
	
	def void mergeRefinements() {
		// TODO: receives a list of refinements modules and returns one module with all merged
	}
	
	def Optional<String> getExtensionByStringHandling(String filename) {
	    return Optional.ofNullable(filename)
	      .filter(f | f.contains("."))
	      .map(f | f.substring(filename.lastIndexOf(".") + 1));
	}
	
	
	def void generateCode(String configuration) {
//		TODO: return CrySL code to be written to the file system
		val config = parseConfiguration(configuration)
		val src = config.inputDir
		
		val modules = config.modules
		
		// TODO: associate classNames to refinements (get className from refinement jvm type)
		for(m: modules) {
			// get all files with .mcsl and add to a list
			if(getExtensionByStringHandling(m.module).get() == 'mcsl') {
				val parsedSpec = parseSpec(src + m.module)
				specs.add(parsedSpec) // add parsed spec to list of specs
			}
			else if(getExtensionByStringHandling(m.module).get() == 'ref') {
				val parsedRef = parseRefinement(src + m.module) // parse refinement and try to get classname
				// refs.add(m.module)
			}			
		}
		
		
		for(String key: specRefs.keySet()) {
			val spec = parseSpec(src + key)
			for(String ref: refs) {
				val r = parseRefinement(src + ref)
				println('refinements:')
				println(r)
			}
		}
		
		// TODO: call the generator procedure
	}
	
	protected def Configuration parseConfiguration(String configuration) {
		val path = Paths.get(configuration)
		
		if(!Files.exists(path)) {
			throw new RuntimeException("The configuration file does not exist " + path)
		}
		
		setupParser()
		
		val result = parser.parse(new FileReader(configuration))
		
		if(result.syntaxErrors.size > 0) {
			throw new RuntimeException("Parser error: " + result.syntaxErrors)
		}
		(result.rootASTElement as Configuration).configuration
	}
	
	def Refinement parseRefinement(String refinement) {
		val path = Paths.get(refinement)
		
		if(!Files.exists(path)) {
			throw new RuntimeException("The configuration file does not exist " + path)
		}
		
		setupParser()
		
		val result = parser.parse(new FileReader(refinement))
		
		if(result.syntaxErrors.size > 0) {
			throw new RuntimeException("Parser error: " + result.syntaxErrors)
		}
		(result.rootASTElement as Refinement).refinement
	}
	
	protected def Spec parseSpec(String spec) {
		val path = Paths.get(spec)
		
		if(!Files.exists(path)) {
			throw new RuntimeException("The spec file does not exist " + path)
		}
		
		setupParser()
		
		val result = parser.parse(new FileReader(spec))
		
		if(result.syntaxErrors.size > 0) {
			throw new RuntimeException("Parser error: " + result.syntaxErrors)
		}
		(result.rootASTElement as MetaCrySL).spec
	}
	
	def void setupParser() {
        val injector = new MetaCrySLStandaloneSetup().createInjectorAndDoEMFRegistration()
        injector.injectMembers(this)
    }
}
