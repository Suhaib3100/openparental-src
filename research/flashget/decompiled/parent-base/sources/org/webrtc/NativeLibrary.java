package org.webrtc;

import org.apache.log4j.Logger;

/* loaded from: classes9.dex */
class NativeLibrary {
    private static boolean libraryLoaded;
    private static String TAG = "NativeLibrary";
    private static final Logger logger = Logger.getLogger("NativeLibrary");
    private static Object lock = new Object();

    static class DefaultLoader implements NativeLibraryLoader {
        DefaultLoader() {
        }

        @Override // org.webrtc.NativeLibraryLoader
        public boolean load(String str) {
            com.codebutler.android_websockets.c.a("Loading library: ", str, NativeLibrary.logger);
            try {
                System.loadLibrary(str);
                return true;
            } catch (UnsatisfiedLinkError e4) {
                NativeLibrary.logger.error("Failed to load native library: " + str, e4);
                return false;
            }
        }
    }

    NativeLibrary() {
    }

    static void initialize(NativeLibraryLoader nativeLibraryLoader, String str) {
        synchronized (lock) {
            try {
                if (libraryLoaded) {
                    logger.debug("Native library has already been loaded.");
                    return;
                }
                logger.debug("Loading native library: " + str);
                libraryLoaded = nativeLibraryLoader.load(str);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    static boolean isLoaded() {
        boolean z4;
        synchronized (lock) {
            z4 = libraryLoaded;
        }
        return z4;
    }
}
