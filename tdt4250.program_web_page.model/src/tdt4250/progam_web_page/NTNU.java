/**
 */
package tdt4250.progam_web_page;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>NTNU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.NTNU#getProgrammes <em>Programmes</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.NTNU#getCourses <em>Courses</em>}</li>
 * </ul>
 *
 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getNTNU()
 * @model
 * @generated
 */
public interface NTNU extends EObject {
	/**
	 * Returns the value of the '<em><b>Programmes</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.progam_web_page.Programme}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Programmes</em>' containment reference list.
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getNTNU_Programmes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Programme> getProgrammes();

	/**
	 * Returns the value of the '<em><b>Courses</b></em>' containment reference list.
	 * The list contents are of type {@link tdt4250.progam_web_page.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Courses</em>' containment reference list.
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getNTNU_Courses()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourses();

} // NTNU
