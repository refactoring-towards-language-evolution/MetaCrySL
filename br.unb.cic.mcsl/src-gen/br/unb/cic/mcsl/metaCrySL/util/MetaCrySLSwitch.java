/**
 * generated by Xtext 2.22.0
 */
package br.unb.cic.mcsl.metaCrySL.util;

import br.unb.cic.mcsl.metaCrySL.AggregateList;
import br.unb.cic.mcsl.metaCrySL.ChoiceExp;
import br.unb.cic.mcsl.metaCrySL.Event;
import br.unb.cic.mcsl.metaCrySL.EventAggregate;
import br.unb.cic.mcsl.metaCrySL.EventExp;
import br.unb.cic.mcsl.metaCrySL.EventMethod;
import br.unb.cic.mcsl.metaCrySL.EventSpec;
import br.unb.cic.mcsl.metaCrySL.Formal;
import br.unb.cic.mcsl.metaCrySL.FormalArg;
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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see br.unb.cic.mcsl.metaCrySL.MetaCrySLPackage
 * @generated
 */
public class MetaCrySLSwitch<T> extends Switch<T>
{
  /**
   * The cached model package
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected static MetaCrySLPackage modelPackage;

  /**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MetaCrySLSwitch()
  {
    if (modelPackage == null)
    {
      modelPackage = MetaCrySLPackage.eINSTANCE;
    }
  }

  /**
   * Checks whether this is a switch for the given package.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @param ePackage the package in question.
   * @return whether this is a switch for the given package.
   * @generated
   */
  @Override
  protected boolean isSwitchFor(EPackage ePackage)
  {
    return ePackage == modelPackage;
  }

  /**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
  @Override
  protected T doSwitch(int classifierID, EObject theEObject)
  {
    switch (classifierID)
    {
      case MetaCrySLPackage.MODEL:
      {
        Model model = (Model)theEObject;
        T result = caseModel(model);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.SPEC:
      {
        Spec spec = (Spec)theEObject;
        T result = caseSpec(spec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.OBJECT_SPEC:
      {
        ObjectSpec objectSpec = (ObjectSpec)theEObject;
        T result = caseObjectSpec(objectSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.OBJECT:
      {
        br.unb.cic.mcsl.metaCrySL.Object object = (br.unb.cic.mcsl.metaCrySL.Object)theEObject;
        T result = caseObject(object);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.EVENT_SPEC:
      {
        EventSpec eventSpec = (EventSpec)theEObject;
        T result = caseEventSpec(eventSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.EVENT:
      {
        Event event = (Event)theEObject;
        T result = caseEvent(event);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.AGGREGATE_LIST:
      {
        AggregateList aggregateList = (AggregateList)theEObject;
        T result = caseAggregateList(aggregateList);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.METHOD_DEF:
      {
        MethodDef methodDef = (MethodDef)theEObject;
        T result = caseMethodDef(methodDef);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.FORMAL_ARGS:
      {
        FormalArgs formalArgs = (FormalArgs)theEObject;
        T result = caseFormalArgs(formalArgs);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.FORMAL_ARG:
      {
        FormalArg formalArg = (FormalArg)theEObject;
        T result = caseFormalArg(formalArg);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.ORDER_SPEC:
      {
        OrderSpec orderSpec = (OrderSpec)theEObject;
        T result = caseOrderSpec(orderSpec);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.EVENT_EXP:
      {
        EventExp eventExp = (EventExp)theEObject;
        T result = caseEventExp(eventExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.EVENT_METHOD:
      {
        EventMethod eventMethod = (EventMethod)theEObject;
        T result = caseEventMethod(eventMethod);
        if (result == null) result = caseEvent(eventMethod);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.EVENT_AGGREGATE:
      {
        EventAggregate eventAggregate = (EventAggregate)theEObject;
        T result = caseEventAggregate(eventAggregate);
        if (result == null) result = caseEvent(eventAggregate);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.WILDCARD:
      {
        Wildcard wildcard = (Wildcard)theEObject;
        T result = caseWildcard(wildcard);
        if (result == null) result = caseFormalArg(wildcard);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.FORMAL:
      {
        Formal formal = (Formal)theEObject;
        T result = caseFormal(formal);
        if (result == null) result = caseFormalArg(formal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.OPTIONAL:
      {
        Optional optional = (Optional)theEObject;
        T result = caseOptional(optional);
        if (result == null) result = caseEventExp(optional);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.ZERO_OR_MORE:
      {
        ZeroOrMore zeroOrMore = (ZeroOrMore)theEObject;
        T result = caseZeroOrMore(zeroOrMore);
        if (result == null) result = caseEventExp(zeroOrMore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.ONE_OR_MORE:
      {
        OneOrMore oneOrMore = (OneOrMore)theEObject;
        T result = caseOneOrMore(oneOrMore);
        if (result == null) result = caseEventExp(oneOrMore);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.CHOICE_EXP:
      {
        ChoiceExp choiceExp = (ChoiceExp)theEObject;
        T result = caseChoiceExp(choiceExp);
        if (result == null) result = caseEventExp(choiceExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MetaCrySLPackage.SEQUENCE_EXP:
      {
        SequenceExp sequenceExp = (SequenceExp)theEObject;
        T result = caseSequenceExp(sequenceExp);
        if (result == null) result = caseEventExp(sequenceExp);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Model</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseModel(Model object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSpec(Spec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObjectSpec(ObjectSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Object</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Object</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseObject(br.unb.cic.mcsl.metaCrySL.Object object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventSpec(EventSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEvent(Event object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Aggregate List</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Aggregate List</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseAggregateList(AggregateList object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Method Def</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Method Def</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseMethodDef(MethodDef object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Args</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Args</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalArgs(FormalArgs object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal Arg</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal Arg</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormalArg(FormalArg object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Order Spec</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Order Spec</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOrderSpec(OrderSpec object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventExp(EventExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Method</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Method</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventMethod(EventMethod object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Event Aggregate</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Event Aggregate</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseEventAggregate(EventAggregate object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Wildcard</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseWildcard(Wildcard object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Formal</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Formal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseFormal(Formal object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Optional</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Optional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOptional(Optional object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Zero Or More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Zero Or More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseZeroOrMore(ZeroOrMore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>One Or More</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>One Or More</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseOneOrMore(OneOrMore object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Choice Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Choice Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseChoiceExp(ChoiceExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Sequence Exp</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseSequenceExp(SequenceExp object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch, but this is the last case anyway.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
  @Override
  public T defaultCase(EObject object)
  {
    return null;
  }

} //MetaCrySLSwitch