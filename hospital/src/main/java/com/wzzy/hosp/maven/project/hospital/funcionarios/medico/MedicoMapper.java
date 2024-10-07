//package com.wzzy.hosp.maven.project.hospital.funcionarios.medico;
//
//import org.mapstruct.Mapper;
//import org.mapstruct.Mapping;
//import org.mapstruct.factory.Mappers;
//
//@Mapper
//public interface MedicoMapper {
//    MedicoMapper INSTANCE = Mappers.getMapper(MedicoMapper.class);
//
//    @Mapping(target = "id", ignore = true)
//    @Mapping(target = "endereco", source = "endereco")
//    Medico toEntity(DadosCadastroMedico dados);
//}