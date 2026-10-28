package com.cby.shareboard;

import com.cby.shareboard.model.DoodleDataBean;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.w;
import kotlin.comparisons.a;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: DoodleDataManager.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001+B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\u000b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u000b\u0010\tJ\u0015\u0010\r\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\r\u0010\fJ\u001b\u0010\r\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\r\u0010\tJ\r\u0010\u000e\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u0003J\r\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u000f\u0010\u0003J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0010\u0010\u0011J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0017J\u001b\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0010\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001c\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010&\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006,"}, d2 = {"Lcom/cby/shareboard/DoodleDataManager;", "", "<init>", "()V", "", "Lcom/cby/shareboard/model/DoodleDataBean;", "doodleDataList", "Lkotlin/k2;", "setDoodleDataList", "(Ljava/util/List;)V", "doodleData", "addDoodleData", "(Lcom/cby/shareboard/model/DoodleDataBean;)V", "removeDoodleData", "clearDoodleData", "notifyDoodleDataChange", "getDoodleDataList", "()Ljava/util/List;", "", "pageId", "(J)Ljava/util/List;", "", "userId", "(JLjava/lang/String;)Ljava/util/List;", "(Ljava/lang/String;)Ljava/util/List;", "Lcom/cby/shareboard/DoodleDataManager$OnDoodleDataChangeListener;", "onDoodleDataChangeListener", "setOnDoodleDataChangeListener", "(Lcom/cby/shareboard/DoodleDataManager$OnDoodleDataChangeListener;)V", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mDoodleDataList", "Ljava/util/concurrent/CopyOnWriteArrayList;", "mOnDoodleDataChangeListener", "Lcom/cby/shareboard/DoodleDataManager$OnDoodleDataChangeListener;", "Ljava/util/concurrent/locks/ReentrantLock;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "OnDoodleDataChangeListener", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDoodleDataManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoodleDataManager.kt\ncom/cby/shareboard/DoodleDataManager\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,150:1\n1045#2:151\n766#2:152\n857#2,2:153\n766#2:155\n857#2,2:156\n766#2:158\n857#2,2:159\n*S KotlinDebug\n*F\n+ 1 DoodleDataManager.kt\ncom/cby/shareboard/DoodleDataManager\n*L\n118#1:151\n124#1:152\n124#1:153,2\n130#1:155\n130#1:156,2\n136#1:158\n136#1:159,2\n*E\n"})
/* loaded from: classes3.dex */
public final class DoodleDataManager {

    @m
    private OnDoodleDataChangeListener mOnDoodleDataChangeListener;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger = c0.c(new DoodleDataManager$logger$2(this));

    @l
    private CopyOnWriteArrayList<DoodleDataBean> mDoodleDataList = new CopyOnWriteArrayList<>();

    @l
    private final ReentrantLock lock = new ReentrantLock();

    /* compiled from: DoodleDataManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/cby/shareboard/DoodleDataManager$OnDoodleDataChangeListener;", "", "", "Lcom/cby/shareboard/model/DoodleDataBean;", "doodleDataList", "Lkotlin/k2;", "onDoodleDataChange", "(Ljava/util/List;)V", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface OnDoodleDataChangeListener {
        void onDoodleDataChange(@l List<DoodleDataBean> doodleDataList);
    }

    private final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    public final void addDoodleData(@l DoodleDataBean doodleData) {
        l0.p(doodleData, ProtectedSandApp.s("઼"));
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.add(doodleData);
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public final void clearDoodleData() {
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.clear();
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @l
    public final List<DoodleDataBean> getDoodleDataList() {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            return w.u5(this.mDoodleDataList, new Comparator() { // from class: com.cby.shareboard.DoodleDataManager$getDoodleDataList$lambda$1$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    return a.l(Long.valueOf(((DoodleDataBean) t4).getTimestamp()), Long.valueOf(((DoodleDataBean) t5).getTimestamp()));
                }
            });
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void notifyDoodleDataChange() {
        OnDoodleDataChangeListener onDoodleDataChangeListener = this.mOnDoodleDataChangeListener;
        if (onDoodleDataChangeListener != null) {
            onDoodleDataChangeListener.onDoodleDataChange(this.mDoodleDataList);
        }
    }

    public final void removeDoodleData(@l DoodleDataBean doodleData) {
        l0.p(doodleData, ProtectedSandApp.s("઼"));
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.remove(doodleData);
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public final void setDoodleDataList(@l List<DoodleDataBean> doodleDataList) {
        l0.p(doodleDataList, ProtectedSandApp.s("ઽ"));
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.clear();
                this.mDoodleDataList.addAll(doodleDataList);
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public final void setOnDoodleDataChangeListener(@l OnDoodleDataChangeListener onDoodleDataChangeListener) {
        l0.p(onDoodleDataChangeListener, ProtectedSandApp.s("િ"));
        this.mOnDoodleDataChangeListener = onDoodleDataChangeListener;
    }

    @l
    public final List<DoodleDataBean> getDoodleDataList(long pageId) {
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CopyOnWriteArrayList<DoodleDataBean> copyOnWriteArrayList = this.mDoodleDataList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                if (((DoodleDataBean) obj).getPageId() == pageId) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void addDoodleData(@l List<DoodleDataBean> doodleDataList) {
        l0.p(doodleDataList, ProtectedSandApp.s("ઽ"));
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.addAll(doodleDataList);
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    public final void removeDoodleData(@l List<DoodleDataBean> doodleDataList) {
        l0.p(doodleDataList, ProtectedSandApp.s("ઽ"));
        this.lock.lock();
        try {
            try {
                this.mDoodleDataList.removeAll(w.a6(doodleDataList));
                notifyDoodleDataChange();
            } catch (Exception e4) {
                e4.printStackTrace();
            }
        } finally {
            this.lock.unlock();
        }
    }

    @l
    public final List<DoodleDataBean> getDoodleDataList(long pageId, @l String userId) {
        l0.p(userId, ProtectedSandApp.s("ા"));
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CopyOnWriteArrayList<DoodleDataBean> copyOnWriteArrayList = this.mDoodleDataList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                DoodleDataBean doodleDataBean = (DoodleDataBean) obj;
                if (doodleDataBean.getPageId() == pageId && l0.g(doodleDataBean.getUserId(), userId)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }

    @l
    public final List<DoodleDataBean> getDoodleDataList(@l String userId) {
        l0.p(userId, ProtectedSandApp.s("ા"));
        ReentrantLock reentrantLock = this.lock;
        reentrantLock.lock();
        try {
            CopyOnWriteArrayList<DoodleDataBean> copyOnWriteArrayList = this.mDoodleDataList;
            ArrayList arrayList = new ArrayList();
            for (Object obj : copyOnWriteArrayList) {
                if (l0.g(((DoodleDataBean) obj).getUserId(), userId)) {
                    arrayList.add(obj);
                }
            }
            return arrayList;
        } finally {
            reentrantLock.unlock();
        }
    }
}
