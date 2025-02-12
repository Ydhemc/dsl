/**
 */
package roboML.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

import roboML.RoboMLFactory;
import roboML.RoboMLPackage;
import roboML.RobotProgram;

/**
 * This is the item provider adapter for a {@link roboML.RobotProgram} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class RobotProgramItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RobotProgramItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

		}
		return itemPropertyDescriptors;
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION);
			childrenFeatures.add(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION);
			childrenFeatures.add(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns RobotProgram.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/RobotProgram"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_RobotProgram_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(RobotProgram.class)) {
		case RoboMLPackage.ROBOT_PROGRAM__DECLARATION:
		case RoboMLPackage.ROBOT_PROGRAM__INSTRUCTION:
		case RoboMLPackage.ROBOT_PROGRAM__EXPRESSION:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION,
				RoboMLFactory.eINSTANCE.createFonction()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION,
				RoboMLFactory.eINSTANCE.createVariable()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION,
				RoboMLFactory.eINSTANCE.createSensor()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION,
				RoboMLFactory.eINSTANCE.createSensorDistance()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__DECLARATION,
				RoboMLFactory.eINSTANCE.createSensorTime()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createLoop()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createCondition()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createCall()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createAssignment()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createreturn()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createBlock()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createForward()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createRotate()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createLeft()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createBackward()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createRight()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__INSTRUCTION,
				RoboMLFactory.eINSTANCE.createSpeed()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createCallExpr()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createVarExpr()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createNegative()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createBinaryArithmetic()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createNot()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createBinaryBool()));

		newChildDescriptors.add(createChildParameter(RoboMLPackage.Literals.ROBOT_PROGRAM__EXPRESSION,
				RoboMLFactory.eINSTANCE.createSensorExpr()));
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return RoboMLEditPlugin.INSTANCE;
	}

}
