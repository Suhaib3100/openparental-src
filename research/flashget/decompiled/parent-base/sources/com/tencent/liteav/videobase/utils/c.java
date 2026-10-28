package com.tencent.liteav.videobase.utils;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Handler;
import android.os.Message;
import com.flashget.parentalcontrol.ProtectedSandApp;
import com.tencent.liteav.base.ContextUtils;
import com.tencent.liteav.base.util.LiteavLog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

/* loaded from: classes7.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    private static final Object f72302f = new Object();

    /* renamed from: g, reason: collision with root package name */
    private static c f72303g;

    /* renamed from: a, reason: collision with root package name */
    final Context f72304a;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f72308e;

    /* renamed from: b, reason: collision with root package name */
    final HashMap<BroadcastReceiver, ArrayList<b>> f72305b = new HashMap<>();

    /* renamed from: d, reason: collision with root package name */
    private final HashMap<String, ArrayList<b>> f72307d = new HashMap<>();

    /* renamed from: c, reason: collision with root package name */
    final ArrayList<a> f72306c = new ArrayList<>();

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        final Intent f72310a;

        /* renamed from: b, reason: collision with root package name */
        final ArrayList<b> f72311b;

        a(Intent intent, ArrayList<b> arrayList) {
            this.f72310a = intent;
            this.f72311b = arrayList;
        }
    }

    static final class b {

        /* renamed from: a, reason: collision with root package name */
        final IntentFilter f72312a;

        /* renamed from: b, reason: collision with root package name */
        final BroadcastReceiver f72313b;

        /* renamed from: c, reason: collision with root package name */
        boolean f72314c;

        /* renamed from: d, reason: collision with root package name */
        boolean f72315d;

        public final String toString() {
            StringBuilder a5 = androidx.fragment.app.a.a(128, ProtectedSandApp.s("啙\u0001"));
            a5.append(this.f72313b);
            a5.append(ProtectedSandApp.s("啚\u0001"));
            a5.append(this.f72312a);
            if (this.f72315d) {
                a5.append(ProtectedSandApp.s("啛\u0001"));
            }
            a5.append(ProtectedSandApp.s("啜\u0001"));
            return a5.toString();
        }
    }

    private c(Context context) {
        this.f72304a = context;
        this.f72308e = new Handler(context.getMainLooper()) { // from class: com.tencent.liteav.videobase.utils.c.1
            @Override // android.os.Handler
            public final void handleMessage(Message message) {
                int size;
                a[] aVarArr;
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                c cVar = c.this;
                while (true) {
                    synchronized (cVar.f72305b) {
                        try {
                            size = cVar.f72306c.size();
                            if (size <= 0) {
                                return;
                            }
                            aVarArr = new a[size];
                            cVar.f72306c.toArray(aVarArr);
                            cVar.f72306c.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    for (int i4 = 0; i4 < size; i4++) {
                        a aVar = aVarArr[i4];
                        int size2 = aVar.f72311b.size();
                        for (int i5 = 0; i5 < size2; i5++) {
                            b bVar = aVar.f72311b.get(i5);
                            if (!bVar.f72315d) {
                                bVar.f72313b.onReceive(cVar.f72304a, aVar.f72310a);
                            }
                        }
                    }
                }
            }
        };
    }

    public static c a() {
        c cVar;
        synchronized (f72302f) {
            try {
                if (f72303g == null) {
                    f72303g = new c(ContextUtils.getApplicationContext());
                }
                cVar = f72303g;
            } catch (Throwable th) {
                throw th;
            }
        }
        return cVar;
    }

    public final boolean a(Intent intent) {
        int i4;
        String str;
        ArrayList arrayList;
        ArrayList<b> arrayList2;
        String str2;
        String s4;
        synchronized (this.f72305b) {
            try {
                String action = intent.getAction();
                String resolveTypeIfNeeded = intent.resolveTypeIfNeeded(this.f72304a.getContentResolver());
                Uri data = intent.getData();
                String scheme = intent.getScheme();
                Set<String> categories = intent.getCategories();
                boolean z4 = (intent.getFlags() & 8) != 0;
                if (z4) {
                    LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啞\u0001") + resolveTypeIfNeeded + ProtectedSandApp.s("啟\u0001") + scheme + ProtectedSandApp.s("啠\u0001") + intent);
                }
                ArrayList<b> arrayList3 = this.f72307d.get(intent.getAction());
                if (arrayList3 != null) {
                    if (z4) {
                        LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啡\u0001").concat(String.valueOf(arrayList3)));
                    }
                    ArrayList arrayList4 = null;
                    int i5 = 0;
                    while (i5 < arrayList3.size()) {
                        b bVar = arrayList3.get(i5);
                        if (z4) {
                            LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啢\u0001") + bVar.f72312a);
                        }
                        if (bVar.f72314c) {
                            if (z4) {
                                LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啣\u0001"));
                            }
                            i4 = i5;
                            arrayList2 = arrayList3;
                            str = action;
                            str2 = resolveTypeIfNeeded;
                            arrayList = arrayList4;
                        } else {
                            i4 = i5;
                            str = action;
                            arrayList = arrayList4;
                            arrayList2 = arrayList3;
                            str2 = resolveTypeIfNeeded;
                            int match = bVar.f72312a.match(action, resolveTypeIfNeeded, scheme, data, categories, ProtectedSandApp.s("啝\u0001"));
                            if (match >= 0) {
                                if (z4) {
                                    LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啤\u0001") + Integer.toHexString(match));
                                }
                                arrayList4 = arrayList == null ? new ArrayList() : arrayList;
                                arrayList4.add(bVar);
                                bVar.f72314c = true;
                                i5 = i4 + 1;
                                action = str;
                                arrayList3 = arrayList2;
                                resolveTypeIfNeeded = str2;
                            } else if (z4) {
                                if (match == -4) {
                                    s4 = ProtectedSandApp.s("啩\u0001");
                                } else if (match == -3) {
                                    s4 = ProtectedSandApp.s("啨\u0001");
                                } else if (match == -2) {
                                    s4 = ProtectedSandApp.s("啧\u0001");
                                } else if (match != -1) {
                                    s4 = ProtectedSandApp.s("啥\u0001");
                                } else {
                                    s4 = ProtectedSandApp.s("啦\u0001");
                                }
                                LiteavLog.v(ProtectedSandApp.s("啝\u0001"), ProtectedSandApp.s("啪\u0001").concat(s4));
                            }
                        }
                        arrayList4 = arrayList;
                        i5 = i4 + 1;
                        action = str;
                        arrayList3 = arrayList2;
                        resolveTypeIfNeeded = str2;
                    }
                    ArrayList arrayList5 = arrayList4;
                    if (arrayList5 != null) {
                        for (int i6 = 0; i6 < arrayList5.size(); i6++) {
                            ((b) arrayList5.get(i6)).f72314c = false;
                        }
                        this.f72306c.add(new a(intent, arrayList5));
                        if (!this.f72308e.hasMessages(1)) {
                            this.f72308e.sendEmptyMessage(1);
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
