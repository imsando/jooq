/*
 * This file is generated by jOOQ.
 */
package org.jooq.generated.tables.daos;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.jooq.Configuration;
import org.jooq.generated.tables.Address;
import org.jooq.generated.tables.records.AddressRecord;
import org.jooq.impl.DAOImpl;
import org.jooq.types.UInteger;


/**
 * This class is generated by jOOQ.
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes", "this-escape" })
public class AddressDao extends DAOImpl<AddressRecord, org.jooq.generated.tables.pojos.Address, UInteger> {

    /**
     * Create a new AddressDao without any configuration
     */
    public AddressDao() {
        super(Address.ADDRESS, org.jooq.generated.tables.pojos.Address.class);
    }

    /**
     * Create a new AddressDao with an attached configuration
     */
    public AddressDao(Configuration configuration) {
        super(Address.ADDRESS, org.jooq.generated.tables.pojos.Address.class, configuration);
    }

    @Override
    public UInteger getId(org.jooq.generated.tables.pojos.Address object) {
        return object.getAddressId();
    }

    /**
     * Fetch records that have <code>address_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfAddressId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Address.ADDRESS.ADDRESS_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByAddressId(UInteger... values) {
        return fetch(Address.ADDRESS.ADDRESS_ID, values);
    }

    /**
     * Fetch a unique record that has <code>address_id = value</code>
     */
    public org.jooq.generated.tables.pojos.Address fetchOneByAddressId(UInteger value) {
        return fetchOne(Address.ADDRESS.ADDRESS_ID, value);
    }

    /**
     * Fetch a unique record that has <code>address_id = value</code>
     */
    public Optional<org.jooq.generated.tables.pojos.Address> fetchOptionalByAddressId(UInteger value) {
        return fetchOptional(Address.ADDRESS.ADDRESS_ID, value);
    }

    /**
     * Fetch records that have <code>address BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfAddress(String lowerInclusive, String upperInclusive) {
        return fetchRange(Address.ADDRESS.ADDRESS_, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByAddress(String... values) {
        return fetch(Address.ADDRESS.ADDRESS_, values);
    }

    /**
     * Fetch records that have <code>address2 BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfAddress2(String lowerInclusive, String upperInclusive) {
        return fetchRange(Address.ADDRESS.ADDRESS2, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>address2 IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByAddress2(String... values) {
        return fetch(Address.ADDRESS.ADDRESS2, values);
    }

    /**
     * Fetch records that have <code>district BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfDistrict(String lowerInclusive, String upperInclusive) {
        return fetchRange(Address.ADDRESS.DISTRICT, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>district IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByDistrict(String... values) {
        return fetch(Address.ADDRESS.DISTRICT, values);
    }

    /**
     * Fetch records that have <code>city_id BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfCityId(UInteger lowerInclusive, UInteger upperInclusive) {
        return fetchRange(Address.ADDRESS.CITY_ID, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>city_id IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByCityId(UInteger... values) {
        return fetch(Address.ADDRESS.CITY_ID, values);
    }

    /**
     * Fetch records that have <code>postal_code BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfPostalCode(String lowerInclusive, String upperInclusive) {
        return fetchRange(Address.ADDRESS.POSTAL_CODE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>postal_code IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByPostalCode(String... values) {
        return fetch(Address.ADDRESS.POSTAL_CODE, values);
    }

    /**
     * Fetch records that have <code>phone BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfPhone(String lowerInclusive, String upperInclusive) {
        return fetchRange(Address.ADDRESS.PHONE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>phone IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByPhone(String... values) {
        return fetch(Address.ADDRESS.PHONE, values);
    }

    /**
     * Fetch records that have <code>last_update BETWEEN lowerInclusive AND
     * upperInclusive</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchRangeOfLastUpdate(LocalDateTime lowerInclusive, LocalDateTime upperInclusive) {
        return fetchRange(Address.ADDRESS.LAST_UPDATE, lowerInclusive, upperInclusive);
    }

    /**
     * Fetch records that have <code>last_update IN (values)</code>
     */
    public List<org.jooq.generated.tables.pojos.Address> fetchByLastUpdate(LocalDateTime... values) {
        return fetch(Address.ADDRESS.LAST_UPDATE, values);
    }
}
