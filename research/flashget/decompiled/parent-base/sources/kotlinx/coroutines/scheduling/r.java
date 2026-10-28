package kotlinx.coroutines.scheduling;

import kotlin.Metadata;
import kotlin.jvm.internal.r1;

/* compiled from: WorkQueue.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\"\u0014\u0010\u0003\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0001\u0010\u0002\"\u0014\u0010\u0005\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0004\u0010\u0002\"\u0014\u0010\u0007\u001a\u00020\u00008\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0006\u0010\u0002\"\u0014\u0010\u000b\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\n\"\u0014\u0010\r\u001a\u00020\b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\n\"\u0018\u0010\u0010\u001a\u00060\u0000j\u0002`\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0002\"\u0018\u0010\u0012\u001a\u00060\u0000j\u0002`\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0002\"\u0018\u0010\u0014\u001a\u00060\u0000j\u0002`\u000e8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0002\"\u0019\u0010\u0017\u001a\u00020\u0000*\u00020\u00158À\u0002X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0001\u0010\u0016*\f\b\u0000\u0010\u0018\"\u00020\u00002\u00020\u0000¨\u0006\u0019"}, d2 = {"", "a", "I", "BUFFER_CAPACITY_BASE", "b", "BUFFER_CAPACITY", "c", "MASK", "", "d", "J", "TASK_STOLEN", "e", "NOTHING_TO_STEAL", "Lkotlinx/coroutines/scheduling/StealingMode;", "f", "STEAL_ANY", "g", "STEAL_CPU_ONLY", "h", "STEAL_BLOCKING_ONLY", "Lkotlinx/coroutines/scheduling/k;", "(Lkotlinx/coroutines/scheduling/k;)I", "maskForStealingMode", "StealingMode", "kotlinx-coroutines-core"}, k = 2, mv = {1, 8, 0}, xi = 48)
@r1({"SMAP\nWorkQueue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n*L\n1#1,255:1\n93#2:256\n*S KotlinDebug\n*F\n+ 1 WorkQueue.kt\nkotlinx/coroutines/scheduling/WorkQueueKt\n*L\n25#1:256\n*E\n"})
/* loaded from: classes7.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public static final int f81021a = 7;

    /* renamed from: b, reason: collision with root package name */
    public static final int f81022b = 128;

    /* renamed from: c, reason: collision with root package name */
    public static final int f81023c = 127;

    /* renamed from: d, reason: collision with root package name */
    public static final long f81024d = -1;

    /* renamed from: e, reason: collision with root package name */
    public static final long f81025e = -2;

    /* renamed from: f, reason: collision with root package name */
    public static final int f81026f = 3;

    /* renamed from: g, reason: collision with root package name */
    public static final int f81027g = 2;

    /* renamed from: h, reason: collision with root package name */
    public static final int f81028h = 1;

    public static final int a(@fg.l k kVar) {
        return kVar.taskContext.getTaskMode() == 1 ? 1 : 2;
    }
}
