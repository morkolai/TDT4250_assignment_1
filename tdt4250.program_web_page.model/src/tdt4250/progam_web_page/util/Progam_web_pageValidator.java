/**
 */
package tdt4250.progam_web_page.util;

import java.util.Map;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import tdt4250.progam_web_page.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see tdt4250.progam_web_page.Progam_web_pagePackage
 * @generated
 */
public class Progam_web_pageValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final Progam_web_pageValidator INSTANCE = new Progam_web_pageValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "tdt4250.progam_web_page";

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 0;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Progam_web_pageValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return Progam_web_pagePackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case Progam_web_pagePackage.PROGRAMME:
				return validateProgramme((Programme)value, diagnostics, context);
			case Progam_web_pagePackage.SPECIALISATION:
				return validateSpecialisation((Specialisation)value, diagnostics, context);
			case Progam_web_pagePackage.SEMESTER:
				return validateSemester((Semester)value, diagnostics, context);
			case Progam_web_pagePackage.COURSE_GROUP:
				return validateCourseGroup((CourseGroup)value, diagnostics, context);
			case Progam_web_pagePackage.COURSE:
				return validateCourse((Course)value, diagnostics, context);
			case Progam_web_pagePackage.NTNU:
				return validateNTNU((NTNU)value, diagnostics, context);
			case Progam_web_pagePackage.GROUP_TYPE:
				return validategroupType((groupType)value, diagnostics, context);
			case Progam_web_pagePackage.DEGREE_LEVEL:
				return validatedegreeLevel((degreeLevel)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProgramme(Programme programme, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(programme, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSpecialisation(Specialisation specialisation, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(specialisation, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateSemester(Semester semester, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(semester, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourseGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(courseGroup, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryBidirectionalReferenceIsPaired(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(courseGroup, diagnostics, context);
		if (result || diagnostics != null) result &= validateCourseGroup_enoghCoursesInGroup(courseGroup, diagnostics, context);
		return result;
	}

	/**
	 * Validates the enoghCoursesInGroup constraint of '<em>Course Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	public boolean validateCourseGroup_enoghCoursesInGroup(CourseGroup courseGroup, DiagnosticChain diagnostics, Map<Object, Object> context) {
		// -> verify the diagnostic details, including severity, code, and message
		
		boolean groupCompleted = false;
		int selectedCoursesCounter = 0;

		// Counts selected courses in a course group
		for (Course c : courseGroup.getCourses()) {
			if(c.isSelected()) {
				selectedCoursesCounter++;
			}
		}
		
		// Determines if the groups are completed acording to their rules
		if (courseGroup.getMandatoryLevel() == groupType.O &&
				selectedCoursesCounter == courseGroup.getCourses().size()) {
			groupCompleted = true;
		}
		else if(courseGroup.getMandatoryLevel() == groupType.M1A && 
				selectedCoursesCounter >= 1) {
			groupCompleted = true;
		}
		else if (courseGroup.getMandatoryLevel() == groupType.M2A && 
				selectedCoursesCounter >= 2) {
			groupCompleted = true;
		}
		
		if (false) {
			if (diagnostics != null) {
				diagnostics.add
					(createDiagnostic
						(Diagnostic.ERROR,
						 DIAGNOSTIC_SOURCE,
						 0,
						 "_UI_GenericConstraint_diagnostic",
						 new Object[] { "enoghCoursesInGroup", getObjectLabel(courseGroup, context) },
						 new Object[] { courseGroup },
						 context));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCourse(Course course, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(course, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNTNU(NTNU ntnu, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(ntnu, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validategroupType(groupType groupType, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatedegreeLevel(degreeLevel degreeLevel, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return true;
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //Progam_web_pageValidator
