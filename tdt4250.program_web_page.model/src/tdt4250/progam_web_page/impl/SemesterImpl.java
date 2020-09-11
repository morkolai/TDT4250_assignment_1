/**
 */
package tdt4250.progam_web_page.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import tdt4250.progam_web_page.Course;
import tdt4250.progam_web_page.CourseGroup;
import tdt4250.progam_web_page.Progam_web_pagePackage;
import tdt4250.progam_web_page.Semester;
import tdt4250.progam_web_page.Specialisation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.impl.SemesterImpl#getSemseterNumb <em>Semseter Numb</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.SemesterImpl#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.SemesterImpl#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.impl.SemesterImpl#getSpecialisation <em>Specialisation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SemesterImpl extends MinimalEObjectImpl.Container implements Semester {
	/**
	 * The default value of the '{@link #getSemseterNumb() <em>Semseter Numb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemseterNumb()
	 * @generated
	 * @ordered
	 */
	protected static final int SEMSETER_NUMB_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSemseterNumb() <em>Semseter Numb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSemseterNumb()
	 * @generated
	 * @ordered
	 */
	protected int semseterNumb = SEMSETER_NUMB_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCourseGroups() <em>Course Groups</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCourseGroups()
	 * @generated
	 * @ordered
	 */
	protected EList<CourseGroup> courseGroups;

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
	 * The cached value of the '{@link #getSpecialisation() <em>Specialisation</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialisation()
	 * @generated
	 * @ordered
	 */
	protected Specialisation specialisation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SemesterImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Progam_web_pagePackage.Literals.SEMESTER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSemseterNumb() {
		return semseterNumb;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSemseterNumb(int newSemseterNumb) {
		int oldSemseterNumb = semseterNumb;
		semseterNumb = newSemseterNumb;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.SEMESTER__SEMSETER_NUMB, oldSemseterNumb, semseterNumb));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CourseGroup> getCourseGroups() {
		if (courseGroups == null) {
			courseGroups = new EObjectContainmentEList<CourseGroup>(CourseGroup.class, this, Progam_web_pagePackage.SEMESTER__COURSE_GROUPS);
		}
		return courseGroups;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Course> getCourses() {
		if (courses == null) {
			courses = new EObjectResolvingEList<Course>(Course.class, this, Progam_web_pagePackage.SEMESTER__COURSES);
		}
		return courses;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialisation getSpecialisation() {
		return specialisation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecialisation(Specialisation newSpecialisation, NotificationChain msgs) {
		Specialisation oldSpecialisation = specialisation;
		specialisation = newSpecialisation;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.SEMESTER__SPECIALISATION, oldSpecialisation, newSpecialisation);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialisation(Specialisation newSpecialisation) {
		if (newSpecialisation != specialisation) {
			NotificationChain msgs = null;
			if (specialisation != null)
				msgs = ((InternalEObject)specialisation).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - Progam_web_pagePackage.SEMESTER__SPECIALISATION, null, msgs);
			if (newSpecialisation != null)
				msgs = ((InternalEObject)newSpecialisation).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - Progam_web_pagePackage.SEMESTER__SPECIALISATION, null, msgs);
			msgs = basicSetSpecialisation(newSpecialisation, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Progam_web_pagePackage.SEMESTER__SPECIALISATION, newSpecialisation, newSpecialisation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
			case Progam_web_pagePackage.SEMESTER__SPECIALISATION:
				return basicSetSpecialisation(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Progam_web_pagePackage.SEMESTER__SEMSETER_NUMB:
				return getSemseterNumb();
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				return getCourseGroups();
			case Progam_web_pagePackage.SEMESTER__COURSES:
				return getCourses();
			case Progam_web_pagePackage.SEMESTER__SPECIALISATION:
				return getSpecialisation();
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
			case Progam_web_pagePackage.SEMESTER__SEMSETER_NUMB:
				setSemseterNumb((Integer)newValue);
				return;
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				getCourseGroups().addAll((Collection<? extends CourseGroup>)newValue);
				return;
			case Progam_web_pagePackage.SEMESTER__COURSES:
				getCourses().clear();
				getCourses().addAll((Collection<? extends Course>)newValue);
				return;
			case Progam_web_pagePackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)newValue);
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
			case Progam_web_pagePackage.SEMESTER__SEMSETER_NUMB:
				setSemseterNumb(SEMSETER_NUMB_EDEFAULT);
				return;
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				getCourseGroups().clear();
				return;
			case Progam_web_pagePackage.SEMESTER__COURSES:
				getCourses().clear();
				return;
			case Progam_web_pagePackage.SEMESTER__SPECIALISATION:
				setSpecialisation((Specialisation)null);
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
			case Progam_web_pagePackage.SEMESTER__SEMSETER_NUMB:
				return semseterNumb != SEMSETER_NUMB_EDEFAULT;
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				return courseGroups != null && !courseGroups.isEmpty();
			case Progam_web_pagePackage.SEMESTER__COURSES:
				return courses != null && !courses.isEmpty();
			case Progam_web_pagePackage.SEMESTER__SPECIALISATION:
				return specialisation != null;
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
		result.append(" (semseterNumb: ");
		result.append(semseterNumb);
		result.append(')');
		return result.toString();
	}

} //SemesterImpl
