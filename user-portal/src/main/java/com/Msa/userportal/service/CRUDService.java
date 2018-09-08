package com.Msa.userportal.service;

import java.util.List;
import java.util.Optional;

public interface CRUDService<T> {

    List<?> listAll();

    Optional<T> getById(Long id);

    T saveOrUpdate(T domainObject);

    void delete(Long id);
}
