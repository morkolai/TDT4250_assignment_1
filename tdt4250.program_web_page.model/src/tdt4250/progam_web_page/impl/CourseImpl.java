/**
 */
package tdt4250.progam_web_page.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import tdt4250.progam_web_page.Course;
import tdt4250.progam_web_page.Progam_web_pagePackage;
import tdt4250.progam_web_page.degreeLevel;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.CourseImpl#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CourseImpl extends MinimalEObjectImpl.Container implements Course {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected static final String COURSE_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCourseCode() <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseCode()
	 * @generated
	 * @ordered
	 */
	protected String courseCode = COURSE_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected static final float CREDITS_EDEFAULT = 0.0F;

	/**
	 * The cached value of the '{@link #getCredits() <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCredits()
	 * @generated
	 * @ordered
	 */
	protected float credits = CREDITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected static final degreeLevel LEVEL_EDEFAULT = degreeLevel.FIRST_LEVEL;

	/**
	 * The cached value of the '{@link #getLevel() <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevel()
	 * @generated
	 * @ordered
	 */
	protected degreeLevel level = LEVEL_EDEFAULT;

	/**
	 * The default value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected static final boolean SELECTED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isSelected() <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isSelected()
	 * @generated
	 * @ordered
	 */
	protected boolean selected = SELECTED_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CourseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Progam_web_pagePackage.Literals.COURSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCourseCode() {
		return courseCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCourseCode(String newCourseCode) {
		String oldCourseCode = courseCode;
		courseCode = newCourseCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__COURSE_CODE, oldCourseCode, courseCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public float getCredits() {
		return credits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCredits(float newCredits) {
		float oldCredits = credits;
		credits = newCredits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__CREDITS, oldCredits, credits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public degreeLevel getLevel() {
		return level;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLevel(degreeLevel newLevel) {
		degreeLevel oldLevel = level;
		level = newLevel == null ? LEVEL_EDEFAULT : newLevel;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__LEVEL, oldLevel, level));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isSelected() {
		return selected;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSelected(boolean newSelected) {
		boolean oldSelected = selected;
		selected = newSelected;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.COURSE__SELECTED, oldSelected, selected));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE__NAME:
				return getName();
			case Progam_web_pagePackage.COURSE__COURSE_CODE:
				return getCourseCode();
			case Progam_web_pagePackage.COURSE__CREDITS:
				return getCredits();
			case Progam_web_pagePackage.COURSE__DESCRIPTION:
				return getDescription();
			case Progam_web_pagePackage.COURSE__LEVEL:
				return getLevel();
			case Progam_web_pagePackage.COURSE__SELECTED:
				return isSelected();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Progam_web_pagePackage.COURSE__NAME:
				setName((String)newValue);
				return;
			case Progam_web_pagePackage.COURSE__COURSE_CODE:
				setCourseCode((String)newValue);
				return;
			case Progam_web_pagePackage.COURSE__CREDITS:
				setCredits((Float)newValue);
				return;
			case Progam_web_pagePackage.COURSE__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case Progam_web_pagePackage.COURSE__LEVEL:
				setLevel((degreeLevel)newValue);
				return;
			case Progam_web_pagePackage.COURSE__SELECTED:
				setSelected((Boolean)newValue);
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
			case Progam_web_pagePackage.COURSE__NAME:
				setName(NAME_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE__COURSE_CODE:
				setCourseCode(COURSE_CODE_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE__CREDITS:
				setCredits(CREDITS_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE__LEVEL:
				setLevel(LEVEL_EDEFAULT);
				return;
			case Progam_web_pagePackage.COURSE__SELECTED:
				setSelected(SELECTED_EDEFAULT);
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
			case Progam_web_pagePackage.COURSE__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case Progam_web_pagePackage.COURSE__COURSE_CODE:
				return COURSE_CODE_EDEFAULT == null ? courseCode != null : !COURSE_CODE_EDEFAULT.equals(courseCode);
			case Progam_web_pagePackage.COURSE__CREDITS:
				return credits != CREDITS_EDEFAULT;
			case Progam_web_pagePackage.COURSE__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case Progam_web_pagePackage.COURSE__LEVEL:
				return level != LEVEL_EDEFAULT;
			case Progam_web_pagePackage.COURSE__SELECTED:
				return selected != SELECTED_EDEFAULT;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", courseCode: ");
		result.append(courseCode);
		result.append(", credits: ");
		result.append(credits);
		result.append(", description: ");
		result.append(description);
		result.append(", level: ");
		result.append(level);
		result.append(", selected: ");
		result.append(selected);
		result.append(')');
		return result.toString();
	}

} //CourseImpl
