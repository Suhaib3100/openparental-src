package com.cby.shareboard;

import androidx.constraintlayout.widget.e;
import com.cby.shareboard.ext.SynchronizedKeySet;
import com.cby.shareboard.model.Transaction;
import com.cby.shareboard.utils.JsonUtil;
import com.cby.shareboard.utils.JsonUtilKt;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Metadata;
import kotlin.a1;
import kotlin.b0;
import kotlin.c0;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.l1;
import kotlin.jvm.internal.r1;
import kotlin.jvm.internal.w;
import kotlin.k2;
import kotlin.reflect.u;
import kotlin.text.v;
import kotlin.z0;

/* compiled from: TransactionCenter.kt */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010$\n\u0002\u0010!\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 D2\u00020\u0001:\u0002DEB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u0006\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0015\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0014\u001a\u00020\u00132\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0014\u0010\u0016J%\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u001bJ\u0015\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010\u001d\u001a\u00020\u001c2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001d\u0010\u001fJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u0005¢\u0006\u0004\b \u0010\u001eJ\u001b\u0010 \u001a\u00020\u001c2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b \u0010\u001fJ\r\u0010!\u001a\u00020\u001c¢\u0006\u0004\b!\u0010\u0003J\u001d\u0010\"\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u001c2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b$\u0010#J\u0015\u0010%\u001a\u00020\u001c2\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b%\u0010&J\u001d\u0010*\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010)\u001a\u00020(¢\u0006\u0004\b*\u0010+J#\u0010-\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b/\u0010.J/\u00103\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00072\u0018\u00102\u001a\u0014\u0012\u0004\u0012\u00020\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0100¢\u0006\u0004\b3\u00104J\u001d\u00103\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007¢\u0006\u0004\b3\u00105J\u001d\u00106\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007¢\u0006\u0004\b6\u00105J\r\u00107\u001a\u00020\u001c¢\u0006\u0004\b7\u0010\u0003R\u001b\u0010=\u001a\u0002088BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b9\u0010:\u001a\u0004\b;\u0010<R \u0010?\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020(0>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020\u00050A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010C¨\u0006F"}, d2 = {"Lcom/cby/shareboard/TransactionCenter;", "", "<init>", "()V", "", "Lcom/cby/shareboard/model/Transaction;", "transactions", "", "pack", "(Ljava/util/List;)Ljava/lang/String;", "data", "unpack", "(Ljava/lang/String;)Ljava/util/List;", "getTotalCacheList", "()Ljava/util/List;", "", "getTotalCacheSize", "()I", "transaction", "", "isInTotalCache", "(Lcom/cby/shareboard/model/Transaction;)Z", "(Ljava/util/List;)Z", "", "pageId", "userId", "no", "(JLjava/lang/String;I)Z", "Lkotlin/k2;", "saveToTotalCache", "(Lcom/cby/shareboard/model/Transaction;)V", "(Ljava/util/List;)V", "removeTotalCache", "clearAllTotalCache", "clearTotalCacheByPage", "(JLjava/lang/String;)V", "clearTotalCacheBeforePage", "clearTotalCacheByUser", "(Ljava/lang/String;)V", "sessionId", "Lcom/cby/shareboard/TransactionObserver;", "o", "registerObserver", "(Ljava/lang/String;Lcom/cby/shareboard/TransactionObserver;)V", "channelId", "sendToRemoteByForward", "(Ljava/lang/String;Ljava/util/List;)V", "sendToRemoteByService", "", "", "missingData", "requestMissingData", "(Ljava/lang/String;Ljava/util/Map;)V", "(Ljava/lang/String;Ljava/lang/String;)V", "onReceive", "end", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "", "observers", "Ljava/util/Map;", "Lcom/cby/shareboard/ext/SynchronizedKeySet;", "mTotalCache", "Lcom/cby/shareboard/ext/SynchronizedKeySet;", "Companion", "TransactionCenterHolder", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nTransactionCenter.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TransactionCenter.kt\ncom/cby/shareboard/TransactionCenter\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 JsonUtil.kt\ncom/cby/shareboard/utils/JsonUtil\n*L\n1#1,352:1\n1549#2:353\n1620#2,3:354\n55#3,2:357\n*S KotlinDebug\n*F\n+ 1 TransactionCenter.kt\ncom/cby/shareboard/TransactionCenter\n*L\n43#1:353\n43#1:354,3\n325#1:357,2\n*E\n"})
/* loaded from: classes3.dex */
public final class TransactionCenter {

    /* renamed from: Companion, reason: from kotlin metadata */
    @l
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger = c0.c(new TransactionCenter$logger$2(this));

    @l
    private final Map<String, TransactionObserver> observers = new ConcurrentHashMap();

    @l
    private final SynchronizedKeySet<Transaction> mTotalCache = new SynchronizedKeySet<>();

    /* compiled from: TransactionCenter.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/cby/shareboard/TransactionCenter$Companion;", "", "()V", "getInstance", "Lcom/cby/shareboard/TransactionCenter;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(w wVar) {
            this();
        }

        @l
        public final TransactionCenter getInstance() {
            return TransactionCenterHolder.INSTANCE.getInstance();
        }

        private Companion() {
        }
    }

    /* compiled from: TransactionCenter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÂ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/cby/shareboard/TransactionCenter$TransactionCenterHolder;", "", "()V", "instance", "Lcom/cby/shareboard/TransactionCenter;", "getInstance", "()Lcom/cby/shareboard/TransactionCenter;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class TransactionCenterHolder {

        @l
        public static final TransactionCenterHolder INSTANCE = new TransactionCenterHolder();

        @l
        private static final TransactionCenter instance = new TransactionCenter();

        private TransactionCenterHolder() {
        }

        @l
        public final TransactionCenter getInstance() {
            return instance;
        }
    }

    private final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    private final String pack(List<Transaction> transactions) {
        return JsonUtilKt.toJson(transactions);
    }

    private final List<Transaction> unpack(String data) {
        Object a5;
        List list;
        ArrayList arrayList = new ArrayList();
        try {
            z0.Companion companion = z0.INSTANCE;
            if (v.S1(data)) {
                a5 = null;
            } else {
                a5 = (List) JsonUtil.INSTANCE.getGson().fromJson(data, kotlin.reflect.b0.f(l1.B(List.class, u.INSTANCE.e(l1.n(Transaction.class)))));
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        if (z0.j(a5) && (list = (List) a5) != null) {
            arrayList.addAll(list);
        }
        Throwable e4 = z0.e(a5);
        if (e4 != null) {
            getLogger().error(ProtectedSandApp.s("ૃ") + e4.getLocalizedMessage());
        }
        return arrayList;
    }

    public final void clearAllTotalCache() {
        getLogger().debug(ProtectedSandApp.s("ૄ"));
        synchronized (this.mTotalCache) {
            this.mTotalCache.clear();
            k2 k2Var = k2.f75408a;
        }
    }

    public final void clearTotalCacheBeforePage(long pageId, @l String userId) {
        l0.p(userId, ProtectedSandApp.s("ૅ"));
        getLogger().debug(ProtectedSandApp.s("\u0ac6") + pageId);
        synchronized (this.mTotalCache) {
            kotlin.collections.w.G0(this.mTotalCache, new TransactionCenter$clearTotalCacheBeforePage$1$1(pageId, userId));
        }
    }

    public final void clearTotalCacheByPage(long pageId, @l String userId) {
        l0.p(userId, ProtectedSandApp.s("ૅ"));
        getLogger().debug(ProtectedSandApp.s("ે") + pageId);
        synchronized (this.mTotalCache) {
            kotlin.collections.w.G0(this.mTotalCache, new TransactionCenter$clearTotalCacheByPage$1$1(pageId, userId));
        }
    }

    public final void clearTotalCacheByUser(@l String userId) {
        l0.p(userId, ProtectedSandApp.s("ૅ"));
        getLogger().debug(ProtectedSandApp.s("ૈ") + userId);
        synchronized (this.mTotalCache) {
            kotlin.collections.w.G0(this.mTotalCache, new TransactionCenter$clearTotalCacheByUser$1$1(userId));
        }
    }

    public final void end() {
        getLogger().debug(ProtectedSandApp.s("ૉ"));
        clearAllTotalCache();
        this.observers.clear();
    }

    @m
    public final List<Transaction> getTotalCacheList() {
        ArrayList arrayList;
        synchronized (this.mTotalCache) {
            try {
                z0.Companion companion = z0.INSTANCE;
                HashSet hashSet = new HashSet(this.mTotalCache);
                arrayList = new ArrayList(kotlin.collections.w.b0(hashSet, 10));
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    arrayList.add((Transaction) it.next());
                }
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                Throwable e4 = z0.e(a1.a(th));
                if (e4 == null) {
                    return null;
                }
                getLogger().error(ProtectedSandApp.s("\u0aca") + e4.getMessage());
                return null;
            }
        }
        return arrayList;
    }

    public final int getTotalCacheSize() {
        int size;
        synchronized (this.mTotalCache) {
            size = this.mTotalCache.size();
        }
        return size;
    }

    public final boolean isInTotalCache(@l Transaction transaction) {
        boolean z4;
        l0.p(transaction, ProtectedSandApp.s("ૌ"));
        synchronized (this.mTotalCache) {
            if (!this.mTotalCache.contains(transaction)) {
                z4 = isInTotalCache(transaction.getPageId(), transaction.getUserId(), transaction.getNo());
            }
        }
        return z4;
    }

    public final void onReceive(@l String sessionId, @l String data) {
        TransactionObserver transactionObserver;
        l0.p(sessionId, ProtectedSandApp.s("\u0ace"));
        l0.p(data, ProtectedSandApp.s("\u0acf"));
        getLogger().debug(ProtectedSandApp.s("ૐ") + sessionId + ProtectedSandApp.s("\u0ad1") + data);
        if (!this.observers.containsKey(sessionId) || (transactionObserver = this.observers.get(sessionId)) == null) {
            return;
        }
        transactionObserver.onTransaction(unpack(data));
    }

    public final void registerObserver(@l String sessionId, @l TransactionObserver o4) {
        l0.p(sessionId, ProtectedSandApp.s("\u0ace"));
        l0.p(o4, ProtectedSandApp.s("\u0ad2"));
        getLogger().debug(ProtectedSandApp.s("\u0ad3") + sessionId);
        this.observers.put(sessionId, o4);
    }

    public final void removeTotalCache(@l Transaction transaction) {
        Object a5;
        l0.p(transaction, ProtectedSandApp.s("ૌ"));
        try {
            z0.Companion companion = z0.INSTANCE;
            synchronized (this.mTotalCache) {
                try {
                    if (this.mTotalCache.contains(transaction)) {
                        this.mTotalCache.remove(transaction);
                    }
                    a5 = k2.f75408a;
                } finally {
                }
            }
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        Throwable e4 = z0.e(a5);
        if (e4 != null) {
            getLogger().error(ProtectedSandApp.s("\u0ad4") + e4.getMessage());
        }
    }

    public final void requestMissingData(@l String channelId, @l Map<String, ? extends List<Integer>> missingData) {
        TransactionObserver transactionObserver;
        l0.p(channelId, ProtectedSandApp.s("\u0ad6"));
        l0.p(missingData, ProtectedSandApp.s("\u0ad8"));
        if (missingData.isEmpty()) {
            return;
        }
        getLogger().debug(ProtectedSandApp.s("\u0ad7") + channelId + ProtectedSandApp.s("\u0ad9") + missingData);
        if (!this.observers.containsKey(channelId) || (transactionObserver = this.observers.get(channelId)) == null) {
            return;
        }
        transactionObserver.requestMissingData(missingData);
    }

    public final void saveToTotalCache(@l Transaction transaction) {
        Object a5;
        String s4 = ProtectedSandApp.s("\u0ada");
        String s5 = ProtectedSandApp.s("\u0adb");
        l0.p(transaction, ProtectedSandApp.s("ૌ"));
        synchronized (this.mTotalCache) {
            if (isInTotalCache(transaction)) {
                getLogger().debug(s5 + transaction);
                return;
            }
            try {
                z0.Companion companion = z0.INSTANCE;
                a5 = Boolean.valueOf(this.mTotalCache.add(transaction));
            } catch (Throwable th) {
                z0.Companion companion2 = z0.INSTANCE;
                a5 = a1.a(th);
            }
            Throwable e4 = z0.e(a5);
            if (e4 != null) {
                getLogger().error(s4 + e4.getMessage());
            }
        }
    }

    public final void sendToRemoteByForward(@l String channelId, @l List<Transaction> transactions) {
        TransactionObserver transactionObserver;
        l0.p(channelId, ProtectedSandApp.s("\u0ad6"));
        l0.p(transactions, ProtectedSandApp.s("્"));
        if (transactions.isEmpty()) {
            return;
        }
        String pack = pack(transactions);
        LogUtils logger = getLogger();
        StringBuilder a5 = e.a(ProtectedSandApp.s("\u0ade"), channelId, ProtectedSandApp.s("\u0adf"), transactions.size(), ProtectedSandApp.s("ૠ"));
        a5.append(pack);
        logger.debug(a5.toString());
        if (!this.observers.containsKey(channelId) || (transactionObserver = this.observers.get(channelId)) == null) {
            return;
        }
        transactionObserver.sendToRemoteByForward(pack, transactions);
    }

    public final void sendToRemoteByService(@l String channelId, @l List<Transaction> transactions) {
        TransactionObserver transactionObserver;
        l0.p(channelId, ProtectedSandApp.s("\u0ad6"));
        l0.p(transactions, ProtectedSandApp.s("્"));
        if (transactions.isEmpty()) {
            return;
        }
        String pack = pack(transactions);
        LogUtils logger = getLogger();
        StringBuilder a5 = e.a(ProtectedSandApp.s("ૡ"), channelId, ProtectedSandApp.s("\u0adf"), transactions.size(), ProtectedSandApp.s("ૠ"));
        a5.append(pack);
        logger.debug(a5.toString());
        if (!this.observers.containsKey(channelId) || (transactionObserver = this.observers.get(channelId)) == null) {
            return;
        }
        transactionObserver.sendToRemoteByService(pack, transactions);
    }

    public final boolean isInTotalCache(@l List<Transaction> transactions) {
        boolean containsAll;
        l0.p(transactions, ProtectedSandApp.s("્"));
        synchronized (this.mTotalCache) {
            containsAll = this.mTotalCache.containsAll(transactions);
        }
        return containsAll;
    }

    public final void requestMissingData(@l String channelId, @l String userId) {
        TransactionObserver transactionObserver;
        l0.p(channelId, ProtectedSandApp.s("\u0ad6"));
        l0.p(userId, ProtectedSandApp.s("ૅ"));
        getLogger().debug(ProtectedSandApp.s("\u0ad7") + channelId);
        if (!this.observers.containsKey(channelId) || (transactionObserver = this.observers.get(channelId)) == null) {
            return;
        }
        transactionObserver.requestMissingData(userId);
    }

    public final boolean isInTotalCache(long pageId, @l String userId, int no) {
        l0.p(userId, ProtectedSandApp.s("ૅ"));
        synchronized (this.mTotalCache) {
            try {
                Iterator it = new ArrayList(this.mTotalCache).iterator();
                while (it.hasNext()) {
                    Transaction transaction = (Transaction) it.next();
                    if (transaction.getPageId() == pageId && l0.g(transaction.getUserId(), userId) && transaction.getNo() == no) {
                        return true;
                    }
                }
            } catch (Exception e4) {
                getLogger().error(ProtectedSandApp.s("ો") + e4.getMessage());
            }
            return false;
        }
    }

    public final void removeTotalCache(@l List<Transaction> transactions) {
        Object a5;
        l0.p(transactions, ProtectedSandApp.s("્"));
        try {
            z0.Companion companion = z0.INSTANCE;
        } catch (Throwable th) {
            z0.Companion companion2 = z0.INSTANCE;
            a5 = a1.a(th);
        }
        synchronized (this.mTotalCache) {
            try {
                if (transactions.isEmpty()) {
                    return;
                }
                if (this.mTotalCache.containsAll(transactions)) {
                    a5 = Boolean.valueOf(this.mTotalCache.removeAll(transactions));
                } else {
                    Iterator<Transaction> it = transactions.iterator();
                    while (it.hasNext()) {
                        removeTotalCache(it.next());
                    }
                    a5 = k2.f75408a;
                }
                Throwable e4 = z0.e(a5);
                if (e4 != null) {
                    getLogger().error(ProtectedSandApp.s("\u0ad5") + e4.getMessage());
                }
            } finally {
            }
        }
    }

    public final void saveToTotalCache(@l List<Transaction> transaction) {
        String s4 = ProtectedSandApp.s("\u0adc");
        l0.p(transaction, ProtectedSandApp.s("ૌ"));
        getLogger().debug(ProtectedSandApp.s("\u0add") + transaction);
        synchronized (this.mTotalCache) {
            if (transaction.isEmpty()) {
                return;
            }
            try {
                this.mTotalCache.addAll(transaction);
            } catch (Exception e4) {
                getLogger().error(s4 + e4.getMessage());
                k2 k2Var = k2.f75408a;
            }
        }
    }
}
