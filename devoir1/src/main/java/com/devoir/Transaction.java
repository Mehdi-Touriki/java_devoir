package com.devoir;

import java.util.Date;
import lombok.Getter;
import lombok.AllArgsConstructor;
@Getter
@AllArgsConstructor
public class Transaction {
    private final TransactionType type;
    private final Date timestamp;
    private final String reference;
}
