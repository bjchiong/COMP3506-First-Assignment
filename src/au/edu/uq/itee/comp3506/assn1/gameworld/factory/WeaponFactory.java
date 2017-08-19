package au.edu.uq.itee.comp3506.assn1.gameworld.factory;

import au.edu.uq.itee.comp3506.assn1.gameworld.GameObject;


public class WeaponFactory extends GameObjectFactory {

	@Override
	public GameObject createRandomGameObject() {
		return new GameObject("Weapon");
	}

}
