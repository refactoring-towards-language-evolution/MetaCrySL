/*
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.serializer;

import br.unb.cic.mcsl.metaCrySL.AggregateList;
import br.unb.cic.mcsl.metaCrySL.ChoiceExp;
import br.unb.cic.mcsl.metaCrySL.EventAggregate;
import br.unb.cic.mcsl.metaCrySL.EventExp;
import br.unb.cic.mcsl.metaCrySL.EventMethod;
import br.unb.cic.mcsl.metaCrySL.EventSpec;
import br.unb.cic.mcsl.metaCrySL.Formal;
import br.unb.cic.mcsl.metaCrySL.FormalArgs;
import br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage;
import br.unb.cic.mcsl.metaCrySL.MethodDef;
import br.unb.cic.mcsl.metaCrySL.Model;
import br.unb.cic.mcsl.metaCrySL.ObjectSpec;
import br.unb.cic.mcsl.metaCrySL.OneOrMore;
import br.unb.cic.mcsl.metaCrySL.Optional;
import br.unb.cic.mcsl.metaCrySL.OrderSpec;
import br.unb.cic.mcsl.metaCrySL.SequenceExp;
import br.unb.cic.mcsl.metaCrySL.Spec;
import br.unb.cic.mcsl.metaCrySL.Wildcard;
import br.unb.cic.mcsl.metaCrySL.ZeroOrMore;
import br.unb.cic.mcsl.services.MetaCrySLGrammarAccess;
import com.google.inject.Inject;
import java.util.Set;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Parameter;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.common.types.JvmGenericArrayTypeReference;
import org.eclipse.xtext.common.types.JvmInnerTypeReference;
import org.eclipse.xtext.common.types.JvmLowerBound;
import org.eclipse.xtext.common.types.JvmParameterizedTypeReference;
import org.eclipse.xtext.common.types.JvmTypeParameter;
import org.eclipse.xtext.common.types.JvmUpperBound;
import org.eclipse.xtext.common.types.JvmWildcardTypeReference;
import org.eclipse.xtext.common.types.TypesPackage;
import org.eclipse.xtext.serializer.ISerializationContext;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;
import org.eclipse.xtext.xbase.serializer.XtypeSemanticSequencer;
import org.eclipse.xtext.xtype.XFunctionTypeRef;
import org.eclipse.xtext.xtype.XImportDeclaration;
import org.eclipse.xtext.xtype.XImportSection;
import org.eclipse.xtext.xtype.XtypePackage;

@SuppressWarnings("all")
public class MetaCrySLSemanticSequencer extends XtypeSemanticSequencer {

	@Inject
	private MetaCrySLGrammarAccess grammarAccess;
	
	@Override
	public void sequence(ISerializationContext context, EObject semanticObject) {
		EPackage epackage = semanticObject.eClass().getEPackage();
		ParserRule rule = context.getParserRule();
		Action action = context.getAssignedAction();
		Set<Parameter> parameters = context.getEnabledBooleanParameters();
		if (epackage == MetaCrySLPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case MetaCrySLPackage.AGGREGATE_LIST:
				sequence_AggregateList(context, (AggregateList) semanticObject); 
				return; 
			case MetaCrySLPackage.CHOICE_EXP:
				if (rule == grammarAccess.getChoiceExpRule()
						|| action == grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0()
						|| rule == grammarAccess.getSequenceExpRule()
						|| action == grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0()
						|| rule == grammarAccess.getPrimaryExpRule()) {
					sequence_ChoiceExp(context, (ChoiceExp) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getEventExpRule()) {
					sequence_EventExp(context, (ChoiceExp) semanticObject); 
					return; 
				}
				else break;
			case MetaCrySLPackage.EVENT_AGGREGATE:
				sequence_Event(context, (EventAggregate) semanticObject); 
				return; 
			case MetaCrySLPackage.EVENT_EXP:
				sequence_PrimaryExp(context, (EventExp) semanticObject); 
				return; 
			case MetaCrySLPackage.EVENT_METHOD:
				sequence_Event(context, (EventMethod) semanticObject); 
				return; 
			case MetaCrySLPackage.EVENT_SPEC:
				sequence_EventSpec(context, (EventSpec) semanticObject); 
				return; 
			case MetaCrySLPackage.FORMAL:
				sequence_FormalArg(context, (Formal) semanticObject); 
				return; 
			case MetaCrySLPackage.FORMAL_ARGS:
				sequence_FormalArgs(context, (FormalArgs) semanticObject); 
				return; 
			case MetaCrySLPackage.METHOD_DEF:
				sequence_MethodDef(context, (MethodDef) semanticObject); 
				return; 
			case MetaCrySLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case MetaCrySLPackage.OBJECT:
				sequence_Object(context, (br.unb.cic.mcsl.metaCrySL.Object) semanticObject); 
				return; 
			case MetaCrySLPackage.OBJECT_SPEC:
				sequence_ObjectSpec(context, (ObjectSpec) semanticObject); 
				return; 
			case MetaCrySLPackage.ONE_OR_MORE:
				sequence_EventExp(context, (OneOrMore) semanticObject); 
				return; 
			case MetaCrySLPackage.OPTIONAL:
				sequence_EventExp(context, (Optional) semanticObject); 
				return; 
			case MetaCrySLPackage.ORDER_SPEC:
				sequence_OrderSpec(context, (OrderSpec) semanticObject); 
				return; 
			case MetaCrySLPackage.SEQUENCE_EXP:
				sequence_SequenceExp(context, (SequenceExp) semanticObject); 
				return; 
			case MetaCrySLPackage.SPEC:
				sequence_Spec(context, (Spec) semanticObject); 
				return; 
			case MetaCrySLPackage.WILDCARD:
				sequence_FormalArg(context, (Wildcard) semanticObject); 
				return; 
			case MetaCrySLPackage.ZERO_OR_MORE:
				sequence_EventExp(context, (ZeroOrMore) semanticObject); 
				return; 
			}
		else if (epackage == TypesPackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case TypesPackage.JVM_GENERIC_ARRAY_TYPE_REFERENCE:
				sequence_JvmTypeReference(context, (JvmGenericArrayTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_INNER_TYPE_REFERENCE:
				sequence_JvmParameterizedTypeReference(context, (JvmInnerTypeReference) semanticObject); 
				return; 
			case TypesPackage.JVM_LOWER_BOUND:
				if (rule == grammarAccess.getJvmLowerBoundAndedRule()) {
					sequence_JvmLowerBoundAnded(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmLowerBoundRule()) {
					sequence_JvmLowerBound(context, (JvmLowerBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_PARAMETERIZED_TYPE_REFERENCE:
				if (action == grammarAccess.getJvmParameterizedTypeReferenceAccess().getJvmInnerTypeReferenceOuterAction_1_4_0_0_0()) {
					sequence_JvmParameterizedTypeReference_JvmInnerTypeReference_1_4_0_0_0(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmTypeReferenceRule()
						|| action == grammarAccess.getJvmTypeReferenceAccess().getJvmGenericArrayTypeReferenceComponentTypeAction_0_1_0_0()
						|| rule == grammarAccess.getJvmParameterizedTypeReferenceRule()
						|| rule == grammarAccess.getJvmArgumentTypeReferenceRule()) {
					sequence_JvmParameterizedTypeReference(context, (JvmParameterizedTypeReference) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_TYPE_PARAMETER:
				sequence_JvmTypeParameter(context, (JvmTypeParameter) semanticObject); 
				return; 
			case TypesPackage.JVM_UPPER_BOUND:
				if (rule == grammarAccess.getJvmUpperBoundAndedRule()) {
					sequence_JvmUpperBoundAnded(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else if (rule == grammarAccess.getJvmUpperBoundRule()) {
					sequence_JvmUpperBound(context, (JvmUpperBound) semanticObject); 
					return; 
				}
				else break;
			case TypesPackage.JVM_WILDCARD_TYPE_REFERENCE:
				sequence_JvmWildcardTypeReference(context, (JvmWildcardTypeReference) semanticObject); 
				return; 
			}
		else if (epackage == XtypePackage.eINSTANCE)
			switch (semanticObject.eClass().getClassifierID()) {
			case XtypePackage.XFUNCTION_TYPE_REF:
				sequence_XFunctionTypeRef(context, (XFunctionTypeRef) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_DECLARATION:
				sequence_XImportDeclaration(context, (XImportDeclaration) semanticObject); 
				return; 
			case XtypePackage.XIMPORT_SECTION:
				sequence_XImportSection(context, (XImportSection) semanticObject); 
				return; 
			}
		if (errorAcceptor != null)
			errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Contexts:
	 *     AggregateList returns AggregateList
	 *
	 * Constraint:
	 *     (labels+=ID labels+=ID*)
	 */
	protected void sequence_AggregateList(ISerializationContext context, AggregateList semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     ChoiceExp returns ChoiceExp
	 *     ChoiceExp.ChoiceExp_1_0_0 returns ChoiceExp
	 *     SequenceExp returns ChoiceExp
	 *     SequenceExp.SequenceExp_1_0_0 returns ChoiceExp
	 *     PrimaryExp returns ChoiceExp
	 *
	 * Constraint:
	 *     (left=ChoiceExp_ChoiceExp_1_0_0 right=SequenceExp)
	 */
	protected void sequence_ChoiceExp(ISerializationContext context, ChoiceExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getChoiceExpAccess().getChoiceExpLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getChoiceExpAccess().getRightSequenceExpParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventExp returns ChoiceExp
	 *
	 * Constraint:
	 *     exp=ChoiceExp
	 */
	protected void sequence_EventExp(ISerializationContext context, ChoiceExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.CHOICE_EXP__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_3_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventExp returns OneOrMore
	 *
	 * Constraint:
	 *     exp=ChoiceExp
	 */
	protected void sequence_EventExp(ISerializationContext context, OneOrMore semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.ONE_OR_MORE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.ONE_OR_MORE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_2_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventExp returns Optional
	 *
	 * Constraint:
	 *     exp=ChoiceExp
	 */
	protected void sequence_EventExp(ISerializationContext context, Optional semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.OPTIONAL__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.OPTIONAL__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_0_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventExp returns ZeroOrMore
	 *
	 * Constraint:
	 *     exp=ChoiceExp
	 */
	protected void sequence_EventExp(ISerializationContext context, ZeroOrMore semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.ZERO_OR_MORE__EXP) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.ZERO_OR_MORE__EXP));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventExpAccess().getExpChoiceExpParserRuleCall_1_1_0(), semanticObject.getExp());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     EventSpec returns EventSpec
	 *
	 * Constraint:
	 *     events+=Event+
	 */
	protected void sequence_EventSpec(ISerializationContext context, EventSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Event returns EventAggregate
	 *
	 * Constraint:
	 *     (label=ID aggregate=AggregateList)
	 */
	protected void sequence_Event(ISerializationContext context, EventAggregate semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.EVENT__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.EVENT__LABEL));
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.EVENT_AGGREGATE__AGGREGATE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.EVENT_AGGREGATE__AGGREGATE));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getEventAccess().getLabelIDTerminalRuleCall_1_1_0_0(), semanticObject.getLabel());
		feeder.accept(grammarAccess.getEventAccess().getAggregateAggregateListParserRuleCall_1_2_0(), semanticObject.getAggregate());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Event returns EventMethod
	 *
	 * Constraint:
	 *     (label=ID var=ID? method=MethodDef)
	 */
	protected void sequence_Event(ISerializationContext context, EventMethod semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormalArg returns Formal
	 *
	 * Constraint:
	 *     argument=JvmArgumentTypeReference
	 */
	protected void sequence_FormalArg(ISerializationContext context, Formal semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.FORMAL__ARGUMENT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.FORMAL__ARGUMENT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getFormalArgAccess().getArgumentJvmArgumentTypeReferenceParserRuleCall_1_1_0(), semanticObject.getArgument());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     FormalArg returns Wildcard
	 *
	 * Constraint:
	 *     {Wildcard}
	 */
	protected void sequence_FormalArg(ISerializationContext context, Wildcard semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     FormalArgs returns FormalArgs
	 *
	 * Constraint:
	 *     (args+=[FormalArg|ID] args+=[FormalArg|ID]*)
	 */
	protected void sequence_FormalArgs(ISerializationContext context, FormalArgs semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     MethodDef returns MethodDef
	 *
	 * Constraint:
	 *     (methodName=ID args?=FormalArgs?)
	 */
	protected void sequence_MethodDef(ISerializationContext context, MethodDef semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Model returns Model
	 *
	 * Constraint:
	 *     metaCrySL=Spec
	 */
	protected void sequence_Model(ISerializationContext context, Model semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.MODEL__META_CRY_SL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.MODEL__META_CRY_SL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getModelAccess().getMetaCrySLSpecParserRuleCall_0(), semanticObject.getMetaCrySL());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ObjectSpec returns ObjectSpec
	 *
	 * Constraint:
	 *     objects+=Object+
	 */
	protected void sequence_ObjectSpec(ISerializationContext context, ObjectSpec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Contexts:
	 *     Object returns Object
	 *
	 * Constraint:
	 *     (type=JvmTypeReference varName=ID)
	 */
	protected void sequence_Object(ISerializationContext context, br.unb.cic.mcsl.metaCrySL.Object semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.OBJECT__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.OBJECT__TYPE));
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.OBJECT__VAR_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.OBJECT__VAR_NAME));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getObjectAccess().getTypeJvmTypeReferenceParserRuleCall_1_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getObjectAccess().getVarNameIDTerminalRuleCall_2_0(), semanticObject.getVarName());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     OrderSpec returns OrderSpec
	 *
	 * Constraint:
	 *     order=EventExp
	 */
	protected void sequence_OrderSpec(ISerializationContext context, OrderSpec semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.ORDER_SPEC__ORDER) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.ORDER_SPEC__ORDER));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getOrderSpecAccess().getOrderEventExpParserRuleCall_2_0(), semanticObject.getOrder());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChoiceExp returns EventExp
	 *     ChoiceExp.ChoiceExp_1_0_0 returns EventExp
	 *     SequenceExp returns EventExp
	 *     SequenceExp.SequenceExp_1_0_0 returns EventExp
	 *     PrimaryExp returns EventExp
	 *
	 * Constraint:
	 *     label=ID
	 */
	protected void sequence_PrimaryExp(ISerializationContext context, EventExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.EVENT_EXP__LABEL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.EVENT_EXP__LABEL));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getPrimaryExpAccess().getLabelIDTerminalRuleCall_0_0(), semanticObject.getLabel());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     ChoiceExp returns SequenceExp
	 *     ChoiceExp.ChoiceExp_1_0_0 returns SequenceExp
	 *     SequenceExp returns SequenceExp
	 *     SequenceExp.SequenceExp_1_0_0 returns SequenceExp
	 *     PrimaryExp returns SequenceExp
	 *
	 * Constraint:
	 *     (left=SequenceExp_SequenceExp_1_0_0 right=PrimaryExp)
	 */
	protected void sequence_SequenceExp(ISerializationContext context, SequenceExp semanticObject) {
		if (errorAcceptor != null) {
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.SEQUENCE_EXP__LEFT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.SEQUENCE_EXP__LEFT));
			if (transientValues.isValueTransient(semanticObject, MetaCrySLPackage.Literals.SEQUENCE_EXP__RIGHT) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, MetaCrySLPackage.Literals.SEQUENCE_EXP__RIGHT));
		}
		SequenceFeeder feeder = createSequencerFeeder(context, semanticObject);
		feeder.accept(grammarAccess.getSequenceExpAccess().getSequenceExpLeftAction_1_0_0(), semanticObject.getLeft());
		feeder.accept(grammarAccess.getSequenceExpAccess().getRightPrimaryExpParserRuleCall_1_0_2_0(), semanticObject.getRight());
		feeder.finish();
	}
	
	
	/**
	 * Contexts:
	 *     Spec returns Spec
	 *
	 * Constraint:
	 *     (className=JvmTypeReference objectSpec=ObjectSpec? eventSpec=EventSpec? orderSpec=OrderSpec?)
	 */
	protected void sequence_Spec(ISerializationContext context, Spec semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
}