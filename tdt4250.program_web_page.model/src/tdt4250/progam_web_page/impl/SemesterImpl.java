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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Progam_web_pagePackage.SEMESTER__COURSE_GROUPS:
				return ((InternalEList<?>)getCourseGroups()).basicRemove(otherEnd, msgs);
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
