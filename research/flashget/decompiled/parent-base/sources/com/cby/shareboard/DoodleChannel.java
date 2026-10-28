package com.cby.shareboard;

import android.graphics.Bitmap;
import androidx.core.view.x1;
import com.cby.shareboard.action.Action;
import com.cby.shareboard.action.ActionType;
import com.cby.shareboard.action.MyCircle;
import com.cby.shareboard.action.MyEraser;
import com.cby.shareboard.action.MyImage;
import com.cby.shareboard.action.MyLine;
import com.cby.shareboard.action.MyPath;
import com.cby.shareboard.action.MyPoint;
import com.cby.shareboard.action.MyRect;
import com.cby.shareboard.utils.LogUtils;
import com.flashget.parentalcontrol.ProtectedSandApp;
import fg.l;
import fg.m;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.Metadata;
import kotlin.b0;
import kotlin.c0;
import kotlin.collections.j0;
import kotlin.collections.k;
import kotlin.collections.w;
import kotlin.comparisons.a;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.r1;

/* compiled from: DoodleChannel.kt */
@Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u0006\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\nJ1\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0003J\u0015\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0014¢\u0006\u0004\b\u0013\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u0010¢\u0006\u0004\b\u0019\u0010\u001aJ\u001d\u0010\u0019\u001a\u00020\t2\u0006\u0010\u0018\u001a\u00020\u00102\u0006\u0010\b\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u001bJ\u0013\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001c\u0010\u0007J\u0015\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001c\u0010\u001eJ\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u001f\u0010\u0007J\u0015\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\u001f\u0010\u001eJ\r\u0010 \u001a\u00020\u001d¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001d¢\u0006\u0004\b\"\u0010!J\u0015\u0010\"\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\"\u0010\u001eJ\r\u0010#\u001a\u00020\u001d¢\u0006\u0004\b#\u0010!J\u0015\u0010#\u001a\u00020\u001d2\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b#\u0010\u001eJ\r\u0010$\u001a\u00020\t¢\u0006\u0004\b$\u0010\u0003J\u0015\u0010$\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020\u0014¢\u0006\u0004\b$\u0010&J%\u0010*\u001a\u00020\t2\u0006\u0010'\u001a\u00020\r2\u0006\u0010(\u001a\u00020\r2\u0006\u0010)\u001a\u00020\r¢\u0006\u0004\b*\u0010+J'\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b,\u0010-J/\u0010,\u001a\u0004\u0018\u00010\u00102\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r¢\u0006\u0004\b,\u0010.J\r\u0010/\u001a\u00020\r¢\u0006\u0004\b/\u00100J\r\u00101\u001a\u00020\r¢\u0006\u0004\b1\u00100J\r\u00102\u001a\u00020\r¢\u0006\u0004\b2\u00100J\u0015\u00105\u001a\u00020\t2\u0006\u00104\u001a\u000203¢\u0006\u0004\b5\u00106J\u0015\u00108\u001a\u00020\t2\u0006\u00107\u001a\u00020\u0014¢\u0006\u0004\b8\u0010\u0015J\u0015\u0010:\u001a\u00020\t2\u0006\u00109\u001a\u00020\u000b¢\u0006\u0004\b:\u0010;J\r\u0010<\u001a\u00020\u000b¢\u0006\u0004\b<\u0010=J\u0015\u0010?\u001a\u00020\t2\u0006\u0010>\u001a\u00020\u0014¢\u0006\u0004\b?\u0010\u0015J\u0015\u0010A\u001a\u00020\t2\u0006\u0010@\u001a\u00020\r¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001d¢\u0006\u0004\bC\u0010!J\u0015\u0010D\u001a\u00020\t2\u0006\u0010C\u001a\u00020\u001d¢\u0006\u0004\bD\u0010EJ\r\u0010F\u001a\u00020\u0005¢\u0006\u0004\bF\u0010GR\u001b\u0010M\u001a\u00020H8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u0014\u0010\u0016\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010OR(\u0010Q\u001a\b\u0012\u0004\u0012\u00020\u00100P8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010R\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010UR\u001c\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00100V8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u0010XR\u0016\u0010'\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010YR\u0016\u0010(\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010YR\u0016\u0010)\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010YR\u0018\u0010Z\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[R$\u0010\\\u001a\u0004\u0018\u00010\u00108\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b,\u0010^\"\u0004\b_\u0010\u001aR\u0016\u0010`\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0016\u0010b\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010cR\u0016\u0010d\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010YR\u0016\u0010e\u001a\u00020\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010YR\u0014\u0010C\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010gR\u0014\u0010i\u001a\u00020h8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010j¨\u0006k"}, d2 = {"Lcom/cby/shareboard/DoodleChannel;", "", "<init>", "()V", "", "", "clearOut", "()Ljava/util/List;", "id", "Lkotlin/k2;", "(J)V", "Lcom/cby/shareboard/action/ActionType;", "actionType", "", "x", "y", "Lcom/cby/shareboard/action/Action;", "buildAction", "(Lcom/cby/shareboard/action/ActionType;JFF)Lcom/cby/shareboard/action/Action;", "addCurrentAction", "", "(I)V", "index", "()I", "a", "addAction", "(Lcom/cby/shareboard/action/Action;)V", "(Lcom/cby/shareboard/action/Action;I)V", "undo", "", "(J)Z", "redo", "checkIndex", "()Z", "canUndo", "canRedo", "clear", "offset", "(I)Z", "mTranslateX", "mTranslateY", "mCurrentScale", "save", "(FFF)V", "getAction", "(JFF)Lcom/cby/shareboard/action/Action;", "(JLcom/cby/shareboard/action/ActionType;FF)Lcom/cby/shareboard/action/Action;", "getTranslateX", "()F", "getTranslateY", "getCurrentScale", "Landroid/graphics/Bitmap;", "bitmap", "setImage", "(Landroid/graphics/Bitmap;)V", "color", "setPaintColor", "type", "setPaintType", "(Lcom/cby/shareboard/action/ActionType;)V", "getPaintType", "()Lcom/cby/shareboard/action/ActionType;", "size", "setPaintSize", "scale", "setScale", "(F)V", "isChanged", "setChanged", "(Z)V", "getLastChangeTime", "()J", "Lcom/cby/shareboard/utils/LogUtils;", "logger$delegate", "Lkotlin/b0;", "getLogger", "()Lcom/cby/shareboard/utils/LogUtils;", "logger", "Ljava/util/concurrent/atomic/AtomicInteger;", "Ljava/util/concurrent/atomic/AtomicInteger;", "", "actions", "Ljava/util/List;", "getActions", "setActions", "(Ljava/util/List;)V", "Lkotlin/collections/k;", "backActionsQueue", "Lkotlin/collections/k;", "F", "mImage", "Landroid/graphics/Bitmap;", "action", "Lcom/cby/shareboard/action/Action;", "()Lcom/cby/shareboard/action/Action;", "setAction", "mPaintType", "Lcom/cby/shareboard/action/ActionType;", "mPaintColor", "I", "mPaintSize", "mScale", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicLong;", "mLastChangeTime", "Ljava/util/concurrent/atomic/AtomicLong;", "SharedBoard_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@r1({"SMAP\nDoodleChannel.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DoodleChannel.kt\ncom/cby/shareboard/DoodleChannel\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,392:1\n1045#2:393\n1045#2:395\n1045#2:396\n1#3:394\n*S KotlinDebug\n*F\n+ 1 DoodleChannel.kt\ncom/cby/shareboard/DoodleChannel\n*L\n122#1:393\n136#1:395\n272#1:396\n*E\n"})
/* loaded from: classes3.dex */
public final class DoodleChannel {

    @m
    private Action action;

    @m
    private Bitmap mImage;
    private float mTranslateX;
    private float mTranslateY;

    /* renamed from: logger$delegate, reason: from kotlin metadata */
    @l
    private final b0 logger = c0.c(new DoodleChannel$logger$2(this));

    @l
    private final AtomicInteger index = new AtomicInteger(-1);

    @l
    private List<Action> actions = new ArrayList();

    @l
    private k<Action> backActionsQueue = new k<>();
    private float mCurrentScale = 1.0f;

    @l
    private ActionType mPaintType = ActionType.Path;
    private int mPaintColor = x1.f27484y;
    private float mPaintSize = 10.0f;
    private float mScale = 1.0f;

    @l
    private final AtomicBoolean isChanged = new AtomicBoolean(false);

    @l
    private final AtomicLong mLastChangeTime = new AtomicLong(0);

    /* compiled from: DoodleChannel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ActionType.values().length];
            try {
                iArr[ActionType.Eraser.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ActionType.Point.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ActionType.Image.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ActionType.Path.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ActionType.Line.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ActionType.Rect.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[ActionType.Circle.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[ActionType.FilledRect.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[ActionType.FilledCircle.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final Action buildAction(ActionType actionType, long id2, float x4, float y4) {
        switch (WhenMappings.$EnumSwitchMapping$0[actionType.ordinal()]) {
            case 1:
                return new MyEraser().build(id2, x4, y4, this.mScale, 0, this.mPaintSize);
            case 2:
                return new MyPoint().build(id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 3:
                return new MyImage().build(id2, this.mImage, x4, y4, this.mScale, -1, this.mPaintSize);
            case 4:
                return new MyPath().build(id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 5:
                return new MyLine().build(id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 6:
                return new MyRect().build(id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 7:
                return new MyCircle().build(id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 8:
                return new MyRect().build(true, id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            case 9:
                return new MyCircle().build(true, id2, x4, y4, this.mScale, this.mPaintColor, this.mPaintSize);
            default:
                return null;
        }
    }

    private final List<Long> clearOut() {
        ArrayList arrayList = new ArrayList();
        int size = this.actions.size() - 1;
        int i4 = this.index.get() + 1;
        if (i4 <= size) {
            while (true) {
                Action remove = this.actions.remove(size);
                arrayList.add(Long.valueOf(remove.getId()));
                this.backActionsQueue.addLast(remove);
                w.u5(this.backActionsQueue, new Comparator() { // from class: com.cby.shareboard.DoodleChannel$clearOut$$inlined$sortedBy$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t4, T t5) {
                        return a.l(Long.valueOf(((Action) t4).getId()), Long.valueOf(((Action) t5).getId()));
                    }
                });
                getLogger().debug(ProtectedSandApp.s("\u0ab1") + remove + ProtectedSandApp.s("લ") + this.backActionsQueue.toArray());
                setChanged(true);
                if (size == i4) {
                    break;
                }
                size--;
            }
        }
        return arrayList;
    }

    private final LogUtils getLogger() {
        return (LogUtils) this.logger.getValue();
    }

    public final void addAction(@l Action a5) {
        l0.p(a5, ProtectedSandApp.s("ળ"));
        clearOut();
        this.index.incrementAndGet();
        this.actions.add(a5);
        getLogger().debug(ProtectedSandApp.s("\u0ab4") + a5);
        setChanged(true);
    }

    public final void addCurrentAction() {
        Action action = this.action;
        if (action == null || !action.isStarted()) {
            return;
        }
        clearOut();
        this.index.incrementAndGet();
        this.actions.add(action);
        action.applyAdded(true);
        getLogger().debug(ProtectedSandApp.s("વ") + action);
        setChanged(true);
    }

    public final boolean canRedo() {
        return this.backActionsQueue.v() != null;
    }

    public final boolean canUndo() {
        return this.index.get() >= 0 && !this.actions.isEmpty();
    }

    public final boolean checkIndex() {
        if (this.index.get() < 0) {
            return false;
        }
        if (this.index.get() >= this.actions.size()) {
            this.index.set(this.actions.size() - 1);
        }
        return true;
    }

    public final void clear() {
        this.index.set(-1);
        this.actions.clear();
        this.backActionsQueue.clear();
        setChanged(true);
    }

    @m
    public final Action getAction() {
        return this.action;
    }

    @l
    public final List<Action> getActions() {
        return this.actions;
    }

    /* renamed from: getCurrentScale, reason: from getter */
    public final float getMCurrentScale() {
        return this.mCurrentScale;
    }

    public final long getLastChangeTime() {
        return this.mLastChangeTime.get();
    }

    @l
    /* renamed from: getPaintType, reason: from getter */
    public final ActionType getMPaintType() {
        return this.mPaintType;
    }

    /* renamed from: getTranslateX, reason: from getter */
    public final float getMTranslateX() {
        return this.mTranslateX;
    }

    /* renamed from: getTranslateY, reason: from getter */
    public final float getMTranslateY() {
        return this.mTranslateY;
    }

    public final int index() {
        return this.index.get();
    }

    public final boolean isChanged() {
        return this.isChanged.get();
    }

    @l
    public final List<Long> redo() {
        getLogger().debug(ProtectedSandApp.s("ષ") + this.backActionsQueue.toArray());
        ArrayList arrayList = new ArrayList();
        if (canRedo()) {
            Action last = this.backActionsQueue.last();
            this.backActionsQueue.remove(last);
            getLogger().debug(ProtectedSandApp.s("સ") + last + ProtectedSandApp.s("લ") + this.backActionsQueue.toArray());
            addAction(last);
            arrayList.add(Long.valueOf(last.getId()));
        }
        return arrayList;
    }

    public final void save(float mTranslateX, float mTranslateY, float mCurrentScale) {
        this.mTranslateX = mTranslateX;
        this.mTranslateY = mTranslateY;
        this.mCurrentScale = mCurrentScale;
    }

    public final void setAction(@m Action action) {
        this.action = action;
    }

    public final void setActions(@l List<Action> list) {
        l0.p(list, ProtectedSandApp.s("હ"));
        this.actions = list;
    }

    public final void setChanged(boolean isChanged) {
        this.isChanged.set(isChanged);
        if (isChanged) {
            this.mLastChangeTime.set(System.currentTimeMillis());
        }
    }

    public final void setImage(@l Bitmap bitmap) {
        l0.p(bitmap, ProtectedSandApp.s("\u0aba"));
        this.mImage = bitmap;
    }

    public final void setPaintColor(int color) {
        this.mPaintColor = color;
    }

    public final void setPaintSize(int size) {
        this.mPaintSize = size;
    }

    public final void setPaintType(@l ActionType type) {
        l0.p(type, ProtectedSandApp.s("\u0abb"));
        this.mPaintType = type;
    }

    public final void setScale(float scale) {
        this.mScale = scale;
    }

    @l
    public final List<Long> undo() {
        if (!canUndo()) {
            return j0.f74919b;
        }
        this.index.decrementAndGet();
        return clearOut();
    }

    public final boolean canRedo(long id2) {
        Action action;
        Iterator<Action> it = this.backActionsQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                action = null;
                break;
            }
            action = it.next();
            if (action.getId() == id2) {
                break;
            }
        }
        return action != null;
    }

    public final boolean canUndo(long id2) {
        Object obj;
        Iterator<T> it = this.actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((Action) obj).getId() == id2) {
                break;
            }
        }
        return obj != null;
    }

    @m
    public final Action getAction(long id2, float x4, float y4) {
        Action buildAction = buildAction(this.mPaintType, id2, x4, y4);
        if (buildAction != null) {
            this.backActionsQueue.clear();
        } else {
            buildAction = null;
        }
        this.action = buildAction;
        l0.m(buildAction);
        return buildAction;
    }

    public final boolean clear(int offset) {
        if (offset >= this.actions.size() || offset < -1) {
            return false;
        }
        this.index.set(offset);
        int size = this.actions.size();
        while (offset < size) {
            this.backActionsQueue.addLast(this.actions.remove(offset));
            w.u5(this.backActionsQueue, new Comparator() { // from class: com.cby.shareboard.DoodleChannel$clear$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    return a.l(Long.valueOf(((Action) t4).getId()), Long.valueOf(((Action) t5).getId()));
                }
            });
            setChanged(true);
            offset++;
        }
        return true;
    }

    public final boolean undo(long id2) {
        if (!canUndo(id2)) {
            return false;
        }
        this.index.decrementAndGet();
        clearOut(id2);
        return true;
    }

    public final void addAction(@l Action a5, int id2) {
        l0.p(a5, ProtectedSandApp.s("ળ"));
        clearOut();
        this.index.incrementAndGet();
        this.actions.add(id2, a5);
        setChanged(true);
    }

    @m
    public final Action getAction(long id2, @l ActionType actionType, float x4, float y4) {
        l0.p(actionType, ProtectedSandApp.s("શ"));
        Action buildAction = buildAction(actionType, id2, x4, y4);
        if (buildAction != null) {
            this.backActionsQueue.clear();
        } else {
            buildAction = null;
        }
        this.action = buildAction;
        return buildAction;
    }

    public final void addCurrentAction(int id2) {
        Action action = this.action;
        if (action == null || !action.isStarted()) {
            return;
        }
        clearOut();
        this.index.incrementAndGet();
        this.actions.add(id2, action);
        getLogger().debug(ProtectedSandApp.s("વ") + this.action);
        setChanged(true);
    }

    public final boolean redo(long id2) {
        Action action;
        if (!canRedo(id2)) {
            return false;
        }
        Iterator<Action> it = this.backActionsQueue.iterator();
        while (true) {
            if (!it.hasNext()) {
                action = null;
                break;
            }
            action = it.next();
            if (action.getId() == id2) {
                break;
            }
        }
        Action action2 = action;
        if (action2 == null) {
            return false;
        }
        this.backActionsQueue.remove(action2);
        addAction(action2);
        return true;
    }

    private final void clearOut(long id2) {
        Object obj;
        Iterator<T> it = this.actions.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((Action) obj).getId() == id2) {
                    break;
                }
            }
        }
        Action action = (Action) obj;
        if (action != null) {
            this.actions.remove(action);
            this.backActionsQueue.addLast(action);
            w.u5(this.backActionsQueue, new Comparator() { // from class: com.cby.shareboard.DoodleChannel$clearOut$lambda$5$$inlined$sortedBy$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t4, T t5) {
                    return a.l(Long.valueOf(((Action) t4).getId()), Long.valueOf(((Action) t5).getId()));
                }
            });
            getLogger().debug(ProtectedSandApp.s("\u0ab1") + action + ProtectedSandApp.s("લ") + this.backActionsQueue.toArray());
            setChanged(true);
        }
    }
}
