/**
 */
package tdt4250.progam_web_page;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Semester</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.Semester#getSemseterNumb <em>Semseter Numb</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Semester#getCourseGroups <em>Course Groups</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Semester#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getSemester()
 * @model
 * @generated
 */
public interface Semester extends EObject {
	/**
	 * Returns the value of the '<em><b>Semseter Numb</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Semseter Numb</em>' attribute.
	 * @see #setSemseterNumb(int)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getSemester_SemseterNumb()
	 * @model
	 * @generated
	 */
	int getSemseterNumb();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Semester#getSemseterNumb <em>Semseter Numb</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Semseter Numb</em>' attribute.
	 * @see #getSemseterNumb()
	 * @generated
	 */
	void setSemseterNumb(int value);

	/**
	 * Returns the value of the '<em><b>Course Groups</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.progam_web_page.CourseGroup}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Groups</em>' containment reference list.
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getSemester_CourseGroups()
	 * @model containment="true"
	 * @generated
	 */
	EList<CourseGroup> getCourseGroups();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.progam_web_page.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getSemester_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

} // Semester
