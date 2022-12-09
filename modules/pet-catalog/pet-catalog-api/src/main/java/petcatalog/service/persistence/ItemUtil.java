/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package petcatalog.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import petcatalog.model.Item;

/**
 * The persistence utility for the item service. This utility wraps <code>petcatalog.service.persistence.impl.ItemPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ItemPersistence
 * @generated
 */
public class ItemUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Item item) {
		getPersistence().clearCache(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Item> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Item> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Item> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Item update(Item item) {
		return getPersistence().update(item);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Item update(Item item, ServiceContext serviceContext) {
		return getPersistence().update(item, serviceContext);
	}

	/**
	 * Returns all the items where name LIKE &#63;.
	 *
	 * @param name the name
	 * @return the matching items
	 */
	public static List<Item> findByName(String name) {
		return getPersistence().findByName(name);
	}

	/**
	 * Returns a range of all the items where name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByName(String name, int start, int end) {
		return getPersistence().findByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the items where name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByName(
		String name, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByName(name, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByName(
		String name, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByName(
			name, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where name LIKE &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByName_First(
			String name, OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByName_First(name, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where name LIKE &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByName_First(
		String name, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByName_First(name, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where name LIKE &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByName_Last(
			String name, OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where name LIKE &#63;.
	 *
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByName_Last(
		String name, OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByName_Last(name, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where name LIKE &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByName_PrevAndNext(
			long itemId, String name, OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByName_PrevAndNext(
			itemId, name, orderByComparator);
	}

	/**
	 * Returns all the items that the user has permission to view where name LIKE &#63;.
	 *
	 * @param name the name
	 * @return the matching items that the user has permission to view
	 */
	public static List<Item> filterFindByName(String name) {
		return getPersistence().filterFindByName(name);
	}

	/**
	 * Returns a range of all the items that the user has permission to view where name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items that the user has permission to view
	 */
	public static List<Item> filterFindByName(String name, int start, int end) {
		return getPersistence().filterFindByName(name, start, end);
	}

	/**
	 * Returns an ordered range of all the items that the user has permissions to view where name LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items that the user has permission to view
	 */
	public static List<Item> filterFindByName(
		String name, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().filterFindByName(
			name, start, end, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set of items that the user has permission to view where name LIKE &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param name the name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] filterFindByName_PrevAndNext(
			long itemId, String name, OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().filterFindByName_PrevAndNext(
			itemId, name, orderByComparator);
	}

	/**
	 * Removes all the items where name LIKE &#63; from the database.
	 *
	 * @param name the name
	 */
	public static void removeByName(String name) {
		getPersistence().removeByName(name);
	}

	/**
	 * Returns the number of items where name LIKE &#63;.
	 *
	 * @param name the name
	 * @return the number of matching items
	 */
	public static int countByName(String name) {
		return getPersistence().countByName(name);
	}

	/**
	 * Returns the number of items that the user has permission to view where name LIKE &#63;.
	 *
	 * @param name the name
	 * @return the number of matching items that the user has permission to view
	 */
	public static int filterCountByName(String name) {
		return getPersistence().filterCountByName(name);
	}

	/**
	 * Returns all the items where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @return the matching items
	 */
	public static List<Item> findByNameDesc(String name, String description) {
		return getPersistence().findByNameDesc(name, description);
	}

	/**
	 * Returns a range of all the items where name LIKE &#63; and description LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param description the description
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items
	 */
	public static List<Item> findByNameDesc(
		String name, String description, int start, int end) {

		return getPersistence().findByNameDesc(name, description, start, end);
	}

	/**
	 * Returns an ordered range of all the items where name LIKE &#63; and description LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param description the description
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByNameDesc(
		String name, String description, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().findByNameDesc(
			name, description, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items where name LIKE &#63; and description LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param description the description
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching items
	 */
	public static List<Item> findByNameDesc(
		String name, String description, int start, int end,
		OrderByComparator<Item> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByNameDesc(
			name, description, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first item in the ordered set where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByNameDesc_First(
			String name, String description,
			OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByNameDesc_First(
			name, description, orderByComparator);
	}

	/**
	 * Returns the first item in the ordered set where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByNameDesc_First(
		String name, String description,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByNameDesc_First(
			name, description, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item
	 * @throws NoSuchItemException if a matching item could not be found
	 */
	public static Item findByNameDesc_Last(
			String name, String description,
			OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByNameDesc_Last(
			name, description, orderByComparator);
	}

	/**
	 * Returns the last item in the ordered set where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching item, or <code>null</code> if a matching item could not be found
	 */
	public static Item fetchByNameDesc_Last(
		String name, String description,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().fetchByNameDesc_Last(
			name, description, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] findByNameDesc_PrevAndNext(
			long itemId, String name, String description,
			OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByNameDesc_PrevAndNext(
			itemId, name, description, orderByComparator);
	}

	/**
	 * Returns all the items that the user has permission to view where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @return the matching items that the user has permission to view
	 */
	public static List<Item> filterFindByNameDesc(
		String name, String description) {

		return getPersistence().filterFindByNameDesc(name, description);
	}

	/**
	 * Returns a range of all the items that the user has permission to view where name LIKE &#63; and description LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param description the description
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of matching items that the user has permission to view
	 */
	public static List<Item> filterFindByNameDesc(
		String name, String description, int start, int end) {

		return getPersistence().filterFindByNameDesc(
			name, description, start, end);
	}

	/**
	 * Returns an ordered range of all the items that the user has permissions to view where name LIKE &#63; and description LIKE &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param name the name
	 * @param description the description
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching items that the user has permission to view
	 */
	public static List<Item> filterFindByNameDesc(
		String name, String description, int start, int end,
		OrderByComparator<Item> orderByComparator) {

		return getPersistence().filterFindByNameDesc(
			name, description, start, end, orderByComparator);
	}

	/**
	 * Returns the items before and after the current item in the ordered set of items that the user has permission to view where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param itemId the primary key of the current item
	 * @param name the name
	 * @param description the description
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item[] filterFindByNameDesc_PrevAndNext(
			long itemId, String name, String description,
			OrderByComparator<Item> orderByComparator)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().filterFindByNameDesc_PrevAndNext(
			itemId, name, description, orderByComparator);
	}

	/**
	 * Removes all the items where name LIKE &#63; and description LIKE &#63; from the database.
	 *
	 * @param name the name
	 * @param description the description
	 */
	public static void removeByNameDesc(String name, String description) {
		getPersistence().removeByNameDesc(name, description);
	}

	/**
	 * Returns the number of items where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @return the number of matching items
	 */
	public static int countByNameDesc(String name, String description) {
		return getPersistence().countByNameDesc(name, description);
	}

	/**
	 * Returns the number of items that the user has permission to view where name LIKE &#63; and description LIKE &#63;.
	 *
	 * @param name the name
	 * @param description the description
	 * @return the number of matching items that the user has permission to view
	 */
	public static int filterCountByNameDesc(String name, String description) {
		return getPersistence().filterCountByNameDesc(name, description);
	}

	/**
	 * Caches the item in the entity cache if it is enabled.
	 *
	 * @param item the item
	 */
	public static void cacheResult(Item item) {
		getPersistence().cacheResult(item);
	}

	/**
	 * Caches the items in the entity cache if it is enabled.
	 *
	 * @param items the items
	 */
	public static void cacheResult(List<Item> items) {
		getPersistence().cacheResult(items);
	}

	/**
	 * Creates a new item with the primary key. Does not add the item to the database.
	 *
	 * @param itemId the primary key for the new item
	 * @return the new item
	 */
	public static Item create(long itemId) {
		return getPersistence().create(itemId);
	}

	/**
	 * Removes the item with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param itemId the primary key of the item
	 * @return the item that was removed
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item remove(long itemId)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().remove(itemId);
	}

	public static Item updateImpl(Item item) {
		return getPersistence().updateImpl(item);
	}

	/**
	 * Returns the item with the primary key or throws a <code>NoSuchItemException</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item
	 * @throws NoSuchItemException if a item with the primary key could not be found
	 */
	public static Item findByPrimaryKey(long itemId)
		throws petcatalog.exception.NoSuchItemException {

		return getPersistence().findByPrimaryKey(itemId);
	}

	/**
	 * Returns the item with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param itemId the primary key of the item
	 * @return the item, or <code>null</code> if a item with the primary key could not be found
	 */
	public static Item fetchByPrimaryKey(long itemId) {
		return getPersistence().fetchByPrimaryKey(itemId);
	}

	/**
	 * Returns all the items.
	 *
	 * @return the items
	 */
	public static List<Item> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @return the range of items
	 */
	public static List<Item> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of items
	 */
	public static List<Item> findAll(
		int start, int end, OrderByComparator<Item> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the items.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>ItemModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of items
	 * @param end the upper bound of the range of items (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of items
	 */
	public static List<Item> findAll(
		int start, int end, OrderByComparator<Item> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the items from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of items.
	 *
	 * @return the number of items
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static ItemPersistence getPersistence() {
		return _persistence;
	}

	private static volatile ItemPersistence _persistence;

}