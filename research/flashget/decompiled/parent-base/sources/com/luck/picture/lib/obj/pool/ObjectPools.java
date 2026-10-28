package com.luck.picture.lib.obj.pool;

import java.util.LinkedList;

/* loaded from: classes6.dex */
public final class ObjectPools {

    public interface Pool<T> {
        T acquire();

        void destroy();

        boolean release(T t4);
    }

    public static class SimpleObjectPool<T> implements Pool<T> {
        private final LinkedList<T> mPool = new LinkedList<>();

        private boolean isInPool(T t4) {
            return this.mPool.contains(t4);
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public T acquire() {
            return this.mPool.poll();
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public void destroy() {
            this.mPool.clear();
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public boolean release(T t4) {
            if (isInPool(t4)) {
                return false;
            }
            return this.mPool.add(t4);
        }
    }

    public static class SynchronizedPool<T> extends SimpleObjectPool<T> {
        private final Object mLock = new Object();

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public T acquire() {
            T t4;
            synchronized (this.mLock) {
                t4 = (T) super.acquire();
            }
            return t4;
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public void destroy() {
            synchronized (this.mLock) {
                super.destroy();
            }
        }

        @Override // com.luck.picture.lib.obj.pool.ObjectPools.SimpleObjectPool, com.luck.picture.lib.obj.pool.ObjectPools.Pool
        public boolean release(T t4) {
            boolean release;
            synchronized (this.mLock) {
                release = super.release(t4);
            }
            return release;
        }
    }
}
