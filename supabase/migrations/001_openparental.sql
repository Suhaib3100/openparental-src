-- Run once in Supabase → SQL Editor (OpenParental backend on Vercel uses DATABASE_URL)

create extension if not exists "pgcrypto";

create table if not exists "Family" (
  id uuid primary key default gen_random_uuid(),
  name text not null,
  "createdAt" timestamptz not null default now()
);

create table if not exists "User" (
  id uuid primary key default gen_random_uuid(),
  "familyId" uuid not null references "Family"(id) on delete cascade,
  email text not null unique,
  "passwordHash" text not null,
  role text not null default 'PARENT',
  "refreshTokenHash" text,
  "fcmToken" text,
  "createdAt" timestamptz not null default now()
);

create table if not exists "Device" (
  id uuid primary key default gen_random_uuid(),
  "familyId" uuid not null references "Family"(id) on delete cascade,
  name text not null,
  manufacturer text,
  model text,
  platform text not null default 'android',
  "osVersion" text,
  "appVersion" text,
  status text not null default 'PROVISIONING',
  "batteryPct" int,
  "fcmToken" text,
  "secretHash" text not null,
  "lastSeenAt" timestamptz,
  "createdAt" timestamptz not null default now()
);

create table if not exists "Pairing" (
  id uuid primary key default gen_random_uuid(),
  "familyId" uuid not null references "Family"(id) on delete cascade,
  code text not null unique,
  "qrToken" text not null unique,
  status text not null default 'PENDING',
  "deviceName" text,
  "claimedDeviceId" uuid,
  "expiresAt" timestamptz not null,
  "createdAt" timestamptz not null default now()
);

create table if not exists "Command" (
  id uuid primary key default gen_random_uuid(),
  "deviceId" uuid not null references "Device"(id) on delete cascade,
  type text not null,
  payload jsonb,
  state text not null default 'QUEUED',
  "idempotencyKey" text not null unique,
  result jsonb,
  error text,
  "createdAt" timestamptz not null default now(),
  "updatedAt" timestamptz not null default now(),
  "expiresAt" timestamptz not null
);

create table if not exists "Alert" (
  id uuid primary key default gen_random_uuid(),
  "familyId" uuid not null references "Family"(id) on delete cascade,
  "deviceId" uuid references "Device"(id) on delete set null,
  type text not null,
  title text not null,
  body text not null,
  data jsonb,
  "readAt" timestamptz,
  "createdAt" timestamptz not null default now()
);

create table if not exists "Location" (
  id uuid primary key default gen_random_uuid(),
  "deviceId" uuid not null references "Device"(id) on delete cascade,
  lat double precision not null,
  lng double precision not null,
  "accuracyM" double precision,
  "occurredAt" timestamptz not null,
  "createdAt" timestamptz not null default now()
);

create index if not exists idx_device_family on "Device"("familyId");
create index if not exists idx_command_device_state on "Command"("deviceId", state);
create index if not exists idx_alert_family on "Alert"("familyId", "createdAt" desc);
