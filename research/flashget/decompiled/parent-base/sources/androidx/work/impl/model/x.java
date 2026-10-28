package androidx.work.impl.model;

import android.os.Build;
import androidx.annotation.o0;
import androidx.collection.r2;
import androidx.room.t2;
import androidx.work.e;
import androidx.work.f0;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/* compiled from: WorkTypeConverters.java */
/* loaded from: classes3.dex */
public class x {

    /* compiled from: WorkTypeConverters.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f36406a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f36407b;

        /* renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f36408c;

        /* renamed from: d, reason: collision with root package name */
        static final /* synthetic */ int[] f36409d;

        static {
            int[] iArr = new int[androidx.work.y.values().length];
            f36409d = iArr;
            try {
                iArr[androidx.work.y.RUN_AS_NON_EXPEDITED_WORK_REQUEST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36409d[androidx.work.y.DROP_WORK_REQUEST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[androidx.work.t.values().length];
            f36408c = iArr2;
            try {
                iArr2[androidx.work.t.NOT_REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36408c[androidx.work.t.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36408c[androidx.work.t.UNMETERED.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36408c[androidx.work.t.NOT_ROAMING.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36408c[androidx.work.t.METERED.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[androidx.work.a.values().length];
            f36407b = iArr3;
            try {
                iArr3[androidx.work.a.EXPONENTIAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36407b[androidx.work.a.LINEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            int[] iArr4 = new int[f0.a.values().length];
            f36406a = iArr4;
            try {
                iArr4[f0.a.ENQUEUED.ordinal()] = 1;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f36406a[f0.a.RUNNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f36406a[f0.a.SUCCEEDED.ordinal()] = 3;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f36406a[f0.a.FAILED.ordinal()] = 4;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f36406a[f0.a.BLOCKED.ordinal()] = 5;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f36406a[f0.a.CANCELLED.ordinal()] = 6;
            } catch (NoSuchFieldError unused15) {
            }
        }
    }

    /* compiled from: WorkTypeConverters.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final int f36410a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f36411b = 1;
    }

    /* compiled from: WorkTypeConverters.java */
    public interface c {

        /* renamed from: a, reason: collision with root package name */
        public static final int f36412a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f36413b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f36414c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f36415d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f36416e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f36417f = 5;
    }

    /* compiled from: WorkTypeConverters.java */
    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final int f36418a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f36419b = 1;
    }

    /* compiled from: WorkTypeConverters.java */
    public interface e {

        /* renamed from: a, reason: collision with root package name */
        public static final int f36420a = 0;

        /* renamed from: b, reason: collision with root package name */
        public static final int f36421b = 1;

        /* renamed from: c, reason: collision with root package name */
        public static final int f36422c = 2;

        /* renamed from: d, reason: collision with root package name */
        public static final int f36423d = 3;

        /* renamed from: e, reason: collision with root package name */
        public static final int f36424e = 4;

        /* renamed from: f, reason: collision with root package name */
        public static final int f36425f = 5;

        /* renamed from: g, reason: collision with root package name */
        public static final String f36426g = "(2, 3, 5)";
    }

    private x() {
    }

    @t2
    public static int a(androidx.work.a backoffPolicy) {
        int i4 = a.f36407b[backoffPolicy.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + backoffPolicy + " to int");
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x005b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    @androidx.room.t2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.work.e b(byte[] r6) {
        /*
            androidx.work.e r0 = new androidx.work.e
            r0.<init>()
            if (r6 != 0) goto L8
            return r0
        L8:
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream
            r1.<init>(r6)
            r6 = 0
            java.io.ObjectInputStream r2 = new java.io.ObjectInputStream     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40 java.io.IOException -> L44
            int r6 = r2.readInt()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
        L17:
            if (r6 <= 0) goto L2f
            java.lang.String r3 = r2.readUTF()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            android.net.Uri r3 = android.net.Uri.parse(r3)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            boolean r4 = r2.readBoolean()     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            r0.a(r3, r4)     // Catch: java.lang.Throwable -> L2b java.io.IOException -> L2d
            int r6 = r6 + (-1)
            goto L17
        L2b:
            r6 = move-exception
            goto L59
        L2d:
            r6 = move-exception
            goto L48
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r6 = move-exception
            r6.printStackTrace()
        L37:
            r1.close()     // Catch: java.io.IOException -> L3b
            goto L58
        L3b:
            r6 = move-exception
            r6.printStackTrace()
            goto L58
        L40:
            r0 = move-exception
            r2 = r6
            r6 = r0
            goto L59
        L44:
            r2 = move-exception
            r5 = r2
            r2 = r6
            r6 = r5
        L48:
            r6.printStackTrace()     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L55
            r2.close()     // Catch: java.io.IOException -> L51
            goto L55
        L51:
            r6 = move-exception
            r6.printStackTrace()
        L55:
            r1.close()     // Catch: java.io.IOException -> L3b
        L58:
            return r0
        L59:
            if (r2 == 0) goto L63
            r2.close()     // Catch: java.io.IOException -> L5f
            goto L63
        L5f:
            r0 = move-exception
            r0.printStackTrace()
        L63:
            r1.close()     // Catch: java.io.IOException -> L67
            goto L6b
        L67:
            r0 = move-exception
            r0.printStackTrace()
        L6b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.impl.model.x.b(byte[]):androidx.work.e");
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:53:0x0053 -> B:18:0x006a). Please report as a decompilation issue!!! */
    @t2
    public static byte[] c(androidx.work.e triggers) {
        ObjectOutputStream objectOutputStream;
        ObjectOutputStream objectOutputStream2 = null;
        if (triggers.c() == 0) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            try {
                try {
                    objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                } catch (IOException e4) {
                    e = e4;
                }
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e5) {
            e5.printStackTrace();
        }
        try {
            objectOutputStream.writeInt(triggers.c());
            for (e.a aVar : triggers.b()) {
                objectOutputStream.writeUTF(aVar.a().toString());
                objectOutputStream.writeBoolean(aVar.b());
            }
            try {
                objectOutputStream.close();
            } catch (IOException e6) {
                e6.printStackTrace();
            }
            byteArrayOutputStream.close();
        } catch (IOException e7) {
            e = e7;
            objectOutputStream2 = objectOutputStream;
            e.printStackTrace();
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e10) {
                    e10.printStackTrace();
                }
            }
            byteArrayOutputStream.close();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            th = th2;
            objectOutputStream2 = objectOutputStream;
            if (objectOutputStream2 != null) {
                try {
                    objectOutputStream2.close();
                } catch (IOException e11) {
                    e11.printStackTrace();
                }
            }
            try {
                byteArrayOutputStream.close();
                throw th;
            } catch (IOException e12) {
                e12.printStackTrace();
                throw th;
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    @t2
    public static androidx.work.a d(int value) {
        if (value == 0) {
            return androidx.work.a.EXPONENTIAL;
        }
        if (value == 1) {
            return androidx.work.a.LINEAR;
        }
        throw new IllegalArgumentException(r2.a("Could not convert ", value, " to BackoffPolicy"));
    }

    @t2
    public static androidx.work.t e(int value) {
        if (value == 0) {
            return androidx.work.t.NOT_REQUIRED;
        }
        if (value == 1) {
            return androidx.work.t.CONNECTED;
        }
        if (value == 2) {
            return androidx.work.t.UNMETERED;
        }
        if (value == 3) {
            return androidx.work.t.NOT_ROAMING;
        }
        if (value == 4) {
            return androidx.work.t.METERED;
        }
        if (Build.VERSION.SDK_INT < 30 || value != 5) {
            throw new IllegalArgumentException(r2.a("Could not convert ", value, " to NetworkType"));
        }
        return androidx.work.t.TEMPORARILY_UNMETERED;
    }

    @o0
    @t2
    public static androidx.work.y f(int value) {
        if (value == 0) {
            return androidx.work.y.RUN_AS_NON_EXPEDITED_WORK_REQUEST;
        }
        if (value == 1) {
            return androidx.work.y.DROP_WORK_REQUEST;
        }
        throw new IllegalArgumentException(r2.a("Could not convert ", value, " to OutOfQuotaPolicy"));
    }

    @t2
    public static f0.a g(int value) {
        if (value == 0) {
            return f0.a.ENQUEUED;
        }
        if (value == 1) {
            return f0.a.RUNNING;
        }
        if (value == 2) {
            return f0.a.SUCCEEDED;
        }
        if (value == 3) {
            return f0.a.FAILED;
        }
        if (value == 4) {
            return f0.a.BLOCKED;
        }
        if (value == 5) {
            return f0.a.CANCELLED;
        }
        throw new IllegalArgumentException(r2.a("Could not convert ", value, " to State"));
    }

    @t2
    public static int h(androidx.work.t networkType) {
        int i4 = a.f36408c[networkType.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        if (i4 == 3) {
            return 2;
        }
        if (i4 == 4) {
            return 3;
        }
        if (i4 == 5) {
            return 4;
        }
        if (Build.VERSION.SDK_INT >= 30 && networkType == androidx.work.t.TEMPORARILY_UNMETERED) {
            return 5;
        }
        throw new IllegalArgumentException("Could not convert " + networkType + " to int");
    }

    @t2
    public static int i(@o0 androidx.work.y policy) {
        int i4 = a.f36409d[policy.ordinal()];
        if (i4 == 1) {
            return 0;
        }
        if (i4 == 2) {
            return 1;
        }
        throw new IllegalArgumentException("Could not convert " + policy + " to int");
    }

    @t2
    public static int j(f0.a state) {
        switch (a.f36406a[state.ordinal()]) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            default:
                throw new IllegalArgumentException("Could not convert " + state + " to int");
        }
    }
}
