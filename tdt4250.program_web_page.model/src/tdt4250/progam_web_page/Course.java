/**
 */
package tdt4250.progam_web_page;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link tdt4250.progam_web_page.Course#getName <em>Name</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Course#getCourseCode <em>Course Code</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Course#getCredits <em>Credits</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Course#getDescription <em>Description</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Course#getLevel <em>Level</em>}</li>
 *   <li>{@link tdt4250.progam_web_page.Course#isSelected <em>Selected</em>}</li>
 * </ul>
 *
 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='courseCodeFormat'"
 *        annotation="http://www.eclipse.org/acceleo/query/1.0 courseCodeFormat='aql:self.courseCode.ismatrix(\'\\b[a-zA-Z]{2,3}\\d{4}\')'"
 * @generated
 */
public interface Course extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Course Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Code</em>' attribute.
	 * @see #setCourseCode(String)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_CourseCode()
	 * @model
	 * @generated
	 */
	String getCourseCode();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#getCourseCode <em>Course Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Code</em>' attribute.
	 * @see #getCourseCode()
	 * @generated
	 */
	void setCourseCode(String value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Level</b></em>' attribute.
	 * The literals are from the enumeration {@link tdt4250.progam_web_page.degreeLevel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level</em>' attribute.
	 * @see tdt4250.progam_web_page.degreeLevel
	 * @see #setLevel(degreeLevel)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_Level()
	 * @model
	 * @generated
	 */
	degreeLevel getLevel();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#getLevel <em>Level</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Level</em>' attribute.
	 * @see tdt4250.progam_web_page.degreeLevel
	 * @see #getLevel()
	 * @generated
	 */
	void setLevel(degreeLevel value);

	/**
	 * Returns the value of the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Selected</em>' attribute.
	 * @see #setSelected(boolean)
	 * @see tdt4250.progam_web_page.Progam_web_pagePackage#getCourse_Selected()
	 * @model
	 * @generated
	 */
	boolean isSelected();

	/**
	 * Sets the value of the '{@link tdt4250.progam_web_page.Course#isSelected <em>Selected</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Selected</em>' attribute.
	 * @see #isSelected()
	 * @generated
	 */
	void setSelected(boolean value);

} // Course
