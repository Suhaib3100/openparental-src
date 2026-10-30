-- Run once on Postgres (Supabase / local) if ScreenSession already exists without frame columns.
ALTER TABLE "ScreenSession"
  ADD COLUMN IF NOT EXISTS "lastFrameData" TEXT,
  ADD COLUMN IF NOT EXISTS "lastFrameAt" TIMESTAMPTZ;
