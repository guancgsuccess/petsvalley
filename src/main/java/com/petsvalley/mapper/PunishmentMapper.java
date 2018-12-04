package com.petsvalley.mapper;

import com.petsvalley.entity.Punishment;
import com.petsvalley.entity.PunishmentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PunishmentMapper {
    long countByExample( PunishmentExample example );

    int deleteByExample( PunishmentExample example );

    int deleteByPrimaryKey( Integer punId );

    int insert( Punishment record );

    int insertSelective( Punishment record );

    List<Punishment> selectByExample( PunishmentExample example );

    Punishment selectByPrimaryKey( Integer punId );

    int updateByExampleSelective( @Param("record") Punishment record, @Param("example") PunishmentExample example );

    int updateByExample( @Param("record") Punishment record, @Param("example") PunishmentExample example );

    int updateByPrimaryKeySelective( Punishment record );

    int updateByPrimaryKey( Punishment record );
}