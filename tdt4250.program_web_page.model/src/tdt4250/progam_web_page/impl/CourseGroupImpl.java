/**
 */
package tdt4250.progam_web_page.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import tdt4250.progam_web_page.Course;
import tdt4250.progam_web_page.CourseGroup;
import tdt4250.progam_web_page.Progam_web_pagePackage;
import tdt4250.progam_web_page.groupType;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseGroupImpl#getMinimumGroupCredits <em>Minimum Group Credits</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseGroupImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseGroupImpl#getMandatoryLevel <em>Mandatory Level</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseGroupImpl extends MinimalEObjectImpl.Container implements CourseGroup {
	/**
	 * The default value of the '{@link #getMinimumGroupCredits() <em>Minimum Group Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumGroupCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float MINIMUM_GROUP_CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getMinimumGroupCredits() <em>Minimum Group Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinimumGroupCredits()
	 * @generated
	 * @ordered
	 */
	protected float minimumGroupCredits = MINIMUM_GROUP_CREDITS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourses() <em>Courses</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourses()
	 * @generated
	 * @ordered
	 */
	protected EList<Course> courses;

	/**
	 * The default value of the '{@link #getMandatoryLevel() <em>Mandatory Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryLevel()
	 * @generated
	 * @ordered
	 */
	protected static final groupType MANDATORY_LEVEL_EDEFAULT = groupType.O;

	/**
	 * The cached value of the '{@link #getMandatoryLevel() <em>Mandatory Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMandatoryLevel()
	 * @generated
	 * @ordered
	 */
	protected groupType mandatoryLevel = MANDATORY_LEVEL_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseGroupImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Progam_web_pagePackage.Literals.COURSE_GROUP;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getMinimumGroupCredits() {
		return minimumGroupCredits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinimumGroupCredits(float newMinimumGroupCredits) {
		float oldMinimumGroupCredits = minimumGroupCredits;
		minimumGroupCredits = newMinimumGroupCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE_GROUP__MINIMUM_GROUP_CREDITS, oldMinimumGroupCredits, minimumGroupCredits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, Progam_web_pagePackage.COURSE_GROUP__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public groupType getMandatoryLevel() {
		return mandatoryLevel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMandatoryLevel(groupType newMandatoryLevel) {
		groupType oldMandatoryLevel = mandatoryLevel;
		mandatoryLevel = newMandatoryLevel == null ? MANDATORY_LEVEL_EDEFAULT : newMandatoryLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE_GROUP__MANDATORY_LEVEL, oldMandatoryLevel, mandatoryLevel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE_GROUP__MINIMUM_GROUP_CREDITS:
				return getMinimumGroupCredits();
			case Progam_web_pagePackage.COURSE_GROUP__COURSES:
				return getCourses();
			case Progam_web_pagePackage.COURSE_GROUP__MANDATORY_LEVEL:
				return getMandatoryLevel();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE_GROUP__MINIMUM_GROUP_CREDITS:
				setMinimumGroupCredits((Float)newValue);
				return;
			case Progam_web_pagePackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case Progam_web_pagePackage.COURSE_GROUP__MANDATORY_LEVEL:
				setMandatoryLevel((groupType)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE_GROUP__MINIMUM_GROUP_CREDITS:
				setMinimumGroupCredits(MINIMUM_GROUP_CREDITS_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE_GROUP__COURSES:
				getCourses().clear();
				return;
			case Progam_web_pagePackage.COURSE_GROUP__MANDATORY_LEVEL:
				setMandatoryLevel(MANDATORY_LEVEL_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE_GROUP__MINIMUM_GROUP_CREDITS:
				return minimumGroupCredits != MINIMUM_GROUP_CREDITS_EDEFAULT;
			case Progam_web_pagePackage.COURSE_GROUP__COURSES:
				return courses != null && !courses.isEmpty();
			case Progam_web_pagePackage.COURSE_GROUP__MANDATORY_LEVEL:
				return mandatoryLevel != MANDATORY_LEVEL_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (minimumGroupCredits: ");
		result.append(minimumGroupCredits);
		result.append(", mandatoryLevel: ");
		result.append(mandatoryLevel);
		result.append(')');
		return result.toString();
	}

} //CourseGroupImpl
