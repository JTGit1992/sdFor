package com.jt.sdfor.common;

import com.jt.sdfor.biz.ctgy.board1.repository.Board1QueryDslRepository;
import com.querydsl.jpa.impl.JPAQueryFactory;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;



@EnableJpaAuditing
@Configuration
public class TestQueryDslConfig {

    @PersistenceContext
    private EntityManager em;

    @Bean
    public JPAQueryFactory queryFactory() {
        return new JPAQueryFactory(em);
    }

    @Bean
    public Board1QueryDslRepository board1QueryDslRepository() {
        return new Board1QueryDslRepository(queryFactory());
    }
}
