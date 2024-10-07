package com.wzzy.hosp.maven.project.hospital;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface FuncionarioRepository<T, ID> extends JpaRepository<T, ID> {
}