package com.microservices.payment.model.mapper;

import com.microservices.payment.model.dto.PaymentDto;
import com.microservices.payment.model.entity.Payment;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2025-12-14T01:32:55+0530",
    comments = "version: 1.6.0, compiler: javac, environment: Java 23.0.1 (Oracle Corporation)"
)
@Component
public class PaymentMapperImpl implements PaymentMapper {

    @Override
    public PaymentDto toDto(Payment entity) {
        if ( entity == null ) {
            return null;
        }

        PaymentDto.PaymentDtoBuilder paymentDto = PaymentDto.builder();

        paymentDto.id( entity.getId() );
        paymentDto.tranId( entity.getTranId() );
        paymentDto.amount( entity.getAmount() );
        paymentDto.patientId( entity.getPatientId() );

        return paymentDto.build();
    }

    @Override
    public Payment toEntity(PaymentDto dto) {
        if ( dto == null ) {
            return null;
        }

        Payment.PaymentBuilder payment = Payment.builder();

        payment.id( dto.getId() );
        payment.tranId( dto.getTranId() );
        payment.amount( dto.getAmount() );
        payment.patientId( dto.getPatientId() );

        return payment.build();
    }

    @Override
    public List<PaymentDto> toDtos(List<Payment> entities) {
        if ( entities == null ) {
            return null;
        }

        List<PaymentDto> list = new ArrayList<PaymentDto>( entities.size() );
        for ( Payment payment : entities ) {
            list.add( toDto( payment ) );
        }

        return list;
    }

    @Override
    public List<Payment> toEntities(List<PaymentDto> dtos) {
        if ( dtos == null ) {
            return null;
        }

        List<Payment> list = new ArrayList<Payment>( dtos.size() );
        for ( PaymentDto paymentDto : dtos ) {
            list.add( toEntity( paymentDto ) );
        }

        return list;
    }
}
