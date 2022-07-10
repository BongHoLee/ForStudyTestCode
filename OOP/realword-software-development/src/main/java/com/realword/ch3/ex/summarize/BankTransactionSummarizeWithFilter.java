package com.realword.ch3.ex.summarize;

import com.realword.ch3.ex.filter.BankTransactionFilter;
import com.realword.ch3.ex.processor.BankTransaction;

public class BankTransactionSummarizeWithFilter implements BankTransactionSummarize{
    
    private final BankTransactionFilter filter;
    public BankTransactionSummarizeWithFilter(BankTransactionFilter filter) {
        this.filter = filter;
    }

    @Override
    public SummaryStatistics summarize(SummaryStatistics total, BankTransaction transaction) {
        return filter.isMatched(transaction) ? total.calculateWith(transaction) : total;
    }
}
