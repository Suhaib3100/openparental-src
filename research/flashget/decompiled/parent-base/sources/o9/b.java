package o9;

/* compiled from: MiddleOutStrategy.java */
/* loaded from: classes6.dex */
public class b implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f83751a;

    public b(int i4) {
        this.f83751a = i4;
    }

    @Override // o9.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i4 = this.f83751a;
        if (length <= i4) {
            return stackTraceElementArr;
        }
        int i5 = i4 / 2;
        int i6 = i4 - i5;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i4];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i6);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i5, stackTraceElementArr2, i6, i5);
        return stackTraceElementArr2;
    }
}
