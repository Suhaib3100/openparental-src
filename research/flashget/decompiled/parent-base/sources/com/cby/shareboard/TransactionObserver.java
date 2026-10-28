package com.cby.shareboard;

import com.cby.shareboard.model.Transaction;
import fg.l;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: TransactionObserver.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010$\n\u0002\u0010!\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00052\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\u000b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\r\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\bH&¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u000f\u001a\u00020\u00052\u0018\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u00120\u0011H&¢\u0006\u0004\b\u000f\u0010\u0015¨\u0006\u0016"}, d2 = {"Lcom/cby/shareboard/TransactionObserver;", "", "", "Lcom/cby/shareboard/model/Transaction;", "transactions", "Lkotlin/k2;", "onTransaction", "(Ljava/util/List;)V", "", "jsonData", "sourceDatas", "sendToRemoteByForward", "(Ljava/lang/String;Ljava/util/List;)V", "sendToRemoteByService", "userId", "requestMissingData", "(Ljava/lang/String;)V", "", "", "", "missingData", "(Ljava/util/Map;)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface TransactionObserver {
    void onTransaction(@l List<Transaction> transactions);

    void requestMissingData(@l String userId);

    void requestMissingData(@l Map<String, ? extends List<Integer>> missingData);

    void sendToRemoteByForward(@l String jsonData, @l List<Transaction> sourceDatas);

    void sendToRemoteByService(@l String jsonData, @l List<Transaction> sourceDatas);
}
