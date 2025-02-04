package com.susanafigueroa.section04;

import com.susanafigueroa.models.section04.AccountBalance;
import com.susanafigueroa.models.section04.BalanceCheckRequest;
import com.susanafigueroa.models.section04.BankServiceGrpc;
import io.grpc.stub.StreamObserver;

public class BankService extends BankServiceGrpc.BankServiceImplBase {

    // we are receiving the BalanceCheckRequest request
    // this service class which will be processing the request
    // it will be returning the StreamObserver<responseObserver>
    @Override
    public void getAccountBalance(BalanceCheckRequest request, StreamObserver<AccountBalance> responseObserver) {
        var accountNumber = request.getAccountNumber();
        var accountBalance = AccountBalance.newBuilder()
                .setAccountNumber(accountNumber)
                .setBalance(accountNumber * 10)
                .build();
        responseObserver.onNext(accountBalance);
        responseObserver.onCompleted();
    }

}
