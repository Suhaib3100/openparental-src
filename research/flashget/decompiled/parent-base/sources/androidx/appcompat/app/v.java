package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.util.Xml;
import androidx.annotation.o0;
import androidx.appcompat.app.g;
import androidx.appcompat.app.v;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.concurrent.Executor;
import org.xmlpull.v1.XmlSerializer;

/* compiled from: AppLocalesStorageHelper.java */
/* loaded from: classes.dex */
class v {

    /* renamed from: a, reason: collision with root package name */
    static final String f956a = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file";

    /* renamed from: b, reason: collision with root package name */
    static final String f957b = "application_locales";

    /* renamed from: c, reason: collision with root package name */
    static final String f958c = "locales";

    /* renamed from: d, reason: collision with root package name */
    static final String f959d = "androidx.appcompat.app.AppLocalesMetadataHolderService";

    /* renamed from: e, reason: collision with root package name */
    static final String f960e = "AppLocalesStorageHelper";

    /* compiled from: AppLocalesStorageHelper.java */
    static class a implements Executor {

        /* renamed from: b, reason: collision with root package name */
        private final Object f961b = new Object();

        /* renamed from: c, reason: collision with root package name */
        final Queue<Runnable> f962c = new ArrayDeque();

        /* renamed from: d, reason: collision with root package name */
        final Executor f963d;

        /* renamed from: e, reason: collision with root package name */
        Runnable f964e;

        a(Executor executor) {
            this.f963d = executor;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b(Runnable runnable) {
            try {
                runnable.run();
            } finally {
                c();
            }
        }

        protected void c() {
            synchronized (this.f961b) {
                try {
                    Runnable poll = this.f962c.poll();
                    this.f964e = poll;
                    if (poll != null) {
                        this.f963d.execute(poll);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // java.util.concurrent.Executor
        public void execute(final Runnable runnable) {
            synchronized (this.f961b) {
                try {
                    this.f962c.add(new Runnable() { // from class: androidx.appcompat.app.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            v.a.this.b(runnable);
                        }
                    });
                    if (this.f964e == null) {
                        c();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* compiled from: AppLocalesStorageHelper.java */
    static class b implements Executor {
        b() {
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            new Thread(runnable).start();
        }
    }

    private v() {
    }

    static void a(@o0 Context context, @o0 String str) {
        if (str.equals("")) {
            context.deleteFile("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
            return;
        }
        try {
            FileOutputStream openFileOutput = context.openFileOutput("androidx.appcompat.app.AppCompatDelegate.application_locales_record_file", 0);
            XmlSerializer newSerializer = Xml.newSerializer();
            try {
                newSerializer.setOutput(openFileOutput, null);
                newSerializer.startDocument("UTF-8", Boolean.TRUE);
                newSerializer.startTag(null, "locales");
                newSerializer.attribute(null, "application_locales", str);
                newSerializer.endTag(null, "locales");
                newSerializer.endDocument();
                if (openFileOutput == null) {
                    return;
                }
            } catch (Exception unused) {
                if (openFileOutput == null) {
                    return;
                }
            } catch (Throwable th) {
                if (openFileOutput != null) {
                    try {
                        openFileOutput.close();
                    } catch (IOException unused2) {
                    }
                }
                throw th;
            }
            try {
                openFileOutput.close();
            } catch (IOException unused3) {
            }
        } catch (FileNotFoundException unused4) {
            String.format("Storing App Locales : FileNotFoundException: Cannot open file %s for writing ", "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r2 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        r2.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x002b, code lost:
    
        if (r5 != 4) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0038, code lost:
    
        if (r3.getName().equals("locales") == false) goto L53;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x003a, code lost:
    
        r1 = r3.getAttributeValue(null, "application_locales");
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x004d, code lost:
    
        if (r2 != null) goto L37;
     */
    @androidx.annotation.o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static java.lang.String b(@androidx.annotation.o0 android.content.Context r8) {
        /*
            java.lang.String r0 = "androidx.appcompat.app.AppCompatDelegate.application_locales_record_file"
            java.lang.String r1 = ""
            java.io.FileInputStream r2 = r8.openFileInput(r0)     // Catch: java.io.FileNotFoundException -> L5a
            org.xmlpull.v1.XmlPullParser r3 = android.util.Xml.newPullParser()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            java.lang.String r4 = "UTF-8"
            r3.setInput(r2, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            int r4 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
        L15:
            int r5 = r3.next()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            r6 = 1
            if (r5 == r6) goto L41
            r6 = 3
            if (r5 != r6) goto L28
            int r7 = r3.getDepth()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            if (r7 <= r4) goto L41
            goto L28
        L26:
            r8 = move-exception
            goto L47
        L28:
            if (r5 == r6) goto L15
            r6 = 4
            if (r5 != r6) goto L2e
            goto L15
        L2e:
            java.lang.String r5 = r3.getName()     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            java.lang.String r6 = "locales"
            boolean r5 = r5.equals(r6)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
            if (r5 == 0) goto L15
            java.lang.String r4 = "application_locales"
            r5 = 0
            java.lang.String r1 = r3.getAttributeValue(r5, r4)     // Catch: java.lang.Throwable -> L26 java.lang.Throwable -> L4d
        L41:
            if (r2 == 0) goto L50
        L43:
            r2.close()     // Catch: java.io.IOException -> L50
            goto L50
        L47:
            if (r2 == 0) goto L4c
            r2.close()     // Catch: java.io.IOException -> L4c
        L4c:
            throw r8
        L4d:
            if (r2 == 0) goto L50
            goto L43
        L50:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L57
            goto L5a
        L57:
            r8.deleteFile(r0)
        L5a:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.v.b(android.content.Context):java.lang.String");
    }

    static void c(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName componentName = new ComponentName(context, "androidx.appcompat.app.AppLocalesMetadataHolderService");
            if (context.getPackageManager().getComponentEnabledSetting(componentName) != 1) {
                if (g.t().j()) {
                    String b5 = b(context);
                    Object systemService = context.getSystemService("locale");
                    if (systemService != null) {
                        g.b.b(systemService, g.a.a(b5));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(componentName, 1, 1);
            }
        }
    }
}
