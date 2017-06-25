/**
 */
package org.nasdanika.nature.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.ETypeParameter;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.nasdanika.nature.NatureFactory;
import org.nasdanika.nature.NaturePackage;
import org.nasdanika.nature.ЖивоеСущество;
import org.nasdanika.nature.Заяц;
import org.nasdanika.nature.Зверь;
import org.nasdanika.nature.Лес;
import org.nasdanika.nature.Лис;
import org.nasdanika.nature.Пища;
import org.nasdanika.nature.Размер;
import org.nasdanika.nature.Растение;
import org.nasdanika.nature.Трава;
import org.nasdanika.nature.Цвет;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class NaturePackageImpl extends EPackageImpl implements NaturePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass лесEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass живоеСуществоEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass зверьEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass растениеEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass траваEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass заяцEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass лисEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass пищаEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum размерEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum цветEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.nasdanika.nature.NaturePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private NaturePackageImpl() {
		super(eNS_URI, NatureFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link NaturePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static NaturePackage init() {
		if (isInited) return (NaturePackage)EPackage.Registry.INSTANCE.getEPackage(NaturePackage.eNS_URI);

		// Obtain or create and register package
		NaturePackageImpl theNaturePackage = (NaturePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof NaturePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new NaturePackageImpl());

		isInited = true;

		// Create package meta-data objects
		theNaturePackage.createPackageContents();

		// Initialize created meta-data
		theNaturePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theNaturePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(NaturePackage.eNS_URI, theNaturePackage);
		return theNaturePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЛес() {
		return лесEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getЛес_Живоесущество() {
		return (EReference)лесEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЖивоеСущество() {
		return живоеСуществоEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЖивоеСущество_Размер() {
		return (EAttribute)живоеСуществоEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getЖивоеСущество_Цвет() {
		return (EAttribute)живоеСуществоEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЗверь() {
		return зверьEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getЗверь__Ест__Пища() {
		return зверьEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getРастение() {
		return растениеEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getТрава() {
		return траваEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЗаяц() {
		return заяцEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getЛис() {
		return лисEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getПища() {
		return пищаEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getРазмер() {
		return размерEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getЦвет() {
		return цветEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NatureFactory getNatureFactory() {
		return (NatureFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		лесEClass = createEClass(ЛЕС);
		createEReference(лесEClass, ЛЕС__ЖИВОЕСУЩЕСТВО);

		живоеСуществоEClass = createEClass(ЖИВОЕ_СУЩЕСТВО);
		createEAttribute(живоеСуществоEClass, ЖИВОЕ_СУЩЕСТВО__РАЗМЕР);
		createEAttribute(живоеСуществоEClass, ЖИВОЕ_СУЩЕСТВО__ЦВЕТ);

		зверьEClass = createEClass(ЗВЕРЬ);
		createEOperation(зверьEClass, ЗВЕРЬ___ЕСТ__ПИЩА);

		растениеEClass = createEClass(РАСТЕНИЕ);

		траваEClass = createEClass(ТРАВА);

		заяцEClass = createEClass(ЗАЯЦ);

		лисEClass = createEClass(ЛИС);

		пищаEClass = createEClass(ПИЩА);

		// Create enums
		размерEEnum = createEEnum(РАЗМЕР);
		цветEEnum = createEEnum(ЦВЕТ);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters
		ETypeParameter зверьEClass_П = addETypeParameter(зверьEClass, "П");

		// Set bounds for type parameters
		EGenericType g1 = createEGenericType(this.getПища());
		зверьEClass_П.getEBounds().add(g1);

		// Add supertypes to classes
		зверьEClass.getESuperTypes().add(this.getЖивоеСущество());
		растениеEClass.getESuperTypes().add(this.getЖивоеСущество());
		траваEClass.getESuperTypes().add(this.getРастение());
		траваEClass.getESuperTypes().add(this.getПища());
		g1 = createEGenericType(this.getЗверь());
		EGenericType g2 = createEGenericType(this.getТрава());
		g1.getETypeArguments().add(g2);
		заяцEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getПища());
		заяцEClass.getEGenericSuperTypes().add(g1);
		g1 = createEGenericType(this.getЗверь());
		g2 = createEGenericType(this.getЗаяц());
		g1.getETypeArguments().add(g2);
		лисEClass.getEGenericSuperTypes().add(g1);

		// Initialize classes, features, and operations; add parameters
		initEClass(лесEClass, Лес.class, "Лес", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getЛес_Живоесущество(), this.getЖивоеСущество(), null, "живоесущество", null, 0, -1, Лес.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(живоеСуществоEClass, ЖивоеСущество.class, "ЖивоеСущество", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getЖивоеСущество_Размер(), this.getРазмер(), "размер", null, 0, 1, ЖивоеСущество.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getЖивоеСущество_Цвет(), this.getЦвет(), "цвет", null, 0, 1, ЖивоеСущество.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(зверьEClass, Зверь.class, "Зверь", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getЗверь__Ест__Пища(), null, "ест", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(зверьEClass_П);
		addEParameter(op, g1, "пища", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(растениеEClass, Растение.class, "Растение", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(траваEClass, Трава.class, "Трава", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(заяцEClass, Заяц.class, "Заяц", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(лисEClass, Лис.class, "Лис", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(пищаEClass, Пища.class, "Пища", IS_ABSTRACT, IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Initialize enums and add enum literals
		initEEnum(размерEEnum, Размер.class, "Размер");
		addEEnumLiteral(размерEEnum, Размер.МАЛЕНЬКИЙ);
		addEEnumLiteral(размерEEnum, Размер.БОЛЬШОЙ);

		initEEnum(цветEEnum, Цвет.class, "Цвет");
		addEEnumLiteral(цветEEnum, Цвет.БЕЛЫЙ);
		addEEnumLiteral(цветEEnum, Цвет.СЕРЫЙ);
		addEEnumLiteral(цветEEnum, Цвет.РЫЖИЙ);
		addEEnumLiteral(цветEEnum, Цвет.ЖЁЛТЫЙ);
		addEEnumLiteral(цветEEnum, Цвет.ЗЕЛЁНЫЙ);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.eclipse.org/emf/2002/GenModel
		createGenModelAnnotations();
		// org.nasdanika.cdo.web.render
		createOrgAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http://www.eclipse.org/emf/2002/GenModel</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createGenModelAnnotations() {
		String source = "http://www.eclipse.org/emf/2002/GenModel";	
		addAnnotation
		  (лесEClass, 
		   source, 
		   new String[] {
			 "documentation", "\u041b\u0435\u0441 \u044f\u0432\u043b\u044f\u0435\u0442\u0441\u044f \u0434\u043e\u043c\u043e\u043c \u0434\u043b\u044f \u0440\u0430\u0437\u043b\u0438\u0447\u043d\u044b\u0445 \u0436\u0438\u0432\u044b\u0445 \u0441\u0443\u0449\u0435\u0441\u0442\u0432."
		   });
	}

	/**
	 * Initializes the annotations for <b>org.nasdanika.cdo.web.render</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createOrgAnnotations() {
		String source = "org.nasdanika.cdo.web.render";	
		addAnnotation
		  (лесEClass, 
		   source, 
		   new String[] {
			 "label", "{{eclass-name}}",
			 "icon", "{{context-path}}/images/forest.png"
		   });	
		addAnnotation
		  (getЛес_Живоесущество(), 
		   source, 
		   new String[] {
			 "model-element-label", "\u0416\u0438\u0432\u044b\u0435 \u0441\u0443\u0449\u0435\u0441\u0442\u0432\u0430",
			 "type-column", "{{icon}} {{eclass-label}}"
		   });	
		addAnnotation
		  (живоеСуществоEClass, 
		   source, 
		   new String[] {
			 "label", "{{\u0440\u0430\u0437\u043c\u0435\u0440}} {{\u0446\u0432\u0435\u0442}} {{eclass-name}}"
		   });	
		addAnnotation
		  (getЗверь__Ест__Пища(), 
		   source, 
		   new String[] {
			 "web-operation", "# Web Operation"
		   });	
		addAnnotation
		  (траваEClass, 
		   source, 
		   new String[] {
			 "icon", "{{context-path}}/images/grass.png"
		   });	
		addAnnotation
		  (заяцEClass, 
		   source, 
		   new String[] {
			 "icon", "{{context-path}}/images/hare.png"
		   });	
		addAnnotation
		  (лисEClass, 
		   source, 
		   new String[] {
			 "icon", "{{context-path}}/images/fox.png"
		   });
	}

} //NaturePackageImpl
