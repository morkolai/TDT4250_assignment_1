/**
 */
package tdt4250.progam_web_page;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Group</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.CourseGroup#getMinimumGroupCredits <em>Minimum Group Credits</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.CourseGroup#getCourses <em>Courses</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.CourseGroup#getMandatoryLevel <em>Mandatory Level</em>}</li>
 * </ul>
 *
 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourseGroup()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='enoghCoursesInGroup'"
 * @generated
 */
public interface CourseGroup extends EObject {
	/**
	 * Returns the value of the '<em><b>Minimum Group Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Minimum Group Credits</em>' attribute.
	 * @see #setMinimumGroupCredits(float)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourseGroup_MinimumGroupCredits()
	 * @model
	 * @generated
	 */
	float getMinimumGroupCredits();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.CourseGroup#getMinimumGroupCredits <em>Minimum Group Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Minimum Group Credits</em>' attribute.
	 * @see #getMinimumGroupCredits()
	 * @generated
	 */
	void setMinimumGroupCredits(float value);

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' reference list.
	 * The list contents are of type {@link tdt4250.progam_web_page.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' reference list.
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourseGroup_Courses()
	 * @model
	 * @generated
	 */
	EList<Course> getCourses();

	/**
	 * Returns the value of the '<em><b>Mandatory Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.progam_web_page.groupType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Mandatory Level</em>' attribute.
	 * @see tdt4250.progam_web_page.groupType
	 * @see #setMandatoryLevel(groupType)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourseGroup_MandatoryLevel()
	 * @model
	 * @generated
	 */
	groupType getMandatoryLevel();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.CourseGroup#getMandatoryLevel <em>Mandatory Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Mandatory Level</em>' attribute.
	 * @see tdt4250.progam_web_page.groupType
	 * @see #getMandatoryLevel()
	 * @generated
	 */
	void setMandatoryLevel(groupType value);

} // CourseGroup
