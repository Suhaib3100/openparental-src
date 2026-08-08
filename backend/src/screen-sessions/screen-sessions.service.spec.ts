import { BadRequestException, ForbiddenException } from '@nestjs/common';
import { Test } from '@nestjs/testing';
import { AuditService } from '../audit/audit.service';
import { CommandsService } from '../commands/commands.service';
import { DevicesService } from '../devices/devices.service';
import { PrismaService } from '../prisma/prisma.service';
import { ScreenGateway } from '../realtime/screen.gateway';
import { ScreenSessionsService } from './screen-sessions.service';

describe('ScreenSessionsService', () => {
  let service: ScreenSessionsService;
  let prisma: {
    screenSession: {
      create: jest.Mock;
      findUnique: jest.Mock;
      update: jest.Mock;
    };
    device: { findUnique: jest.Mock };
  };
  let devices: { getForFamily: jest.Mock };
  let commands: { enqueue: jest.Mock };
  let audit: { log: jest.Mock };
  let gateway: {
    emitSessionReady: jest.Mock;
    emitSessionEnded: jest.Mock;
    emitSessionDenied: jest.Mock;
  };

  const baseSession = {
    id: 's1',
    deviceId: 'd1',
    startedAt: new Date(),
    endedAt: null as Date | null,
    consented: true,
    transport: 'clip',
    createdAt: new Date(),
  };

  beforeEach(async () => {
    prisma = {
      screenSession: {
        create: jest.fn().mockResolvedValue({ ...baseSession }),
        findUnique: jest.fn().mockResolvedValue({ ...baseSession }),
        update: jest.fn().mockImplementation(async ({ data }) => {
          const current = await prisma.screenSession.findUnique({
            where: { id: 's1' },
          });
          return { ...current, ...data };
        }),
      },
      device: {
        findUnique: jest.fn().mockResolvedValue({ familyId: 'f1' }),
      },
    };
    devices = { getForFamily: jest.fn().mockResolvedValue({ id: 'd1' }) };
    commands = { enqueue: jest.fn().mockResolvedValue({}) };
    audit = { log: jest.fn().mockResolvedValue(undefined) };
    gateway = {
      emitSessionReady: jest.fn(),
      emitSessionEnded: jest.fn(),
      emitSessionDenied: jest.fn(),
    };

    const ref = await Test.createTestingModule({
      providers: [
        ScreenSessionsService,
        { provide: PrismaService, useValue: prisma },
        { provide: DevicesService, useValue: devices },
        { provide: CommandsService, useValue: commands },
        { provide: AuditService, useValue: audit },
        { provide: ScreenGateway, useValue: gateway },
      ],
    }).compile();
    service = ref.get(ScreenSessionsService);
  });

  it('create auto-arms session and enqueues SCREEN_VIEW_REQUEST', async () => {
    const view = await service.create('f1', 'd1', 'u1');
    expect(view.status).toBe('live');
    expect(view.consented).toBe(true);
    expect(commands.enqueue).toHaveBeenCalledWith(
      'f1',
      'd1',
      expect.objectContaining({
        type: 'SCREEN_VIEW_REQUEST',
        payload: { sessionId: 's1' },
      }),
    );
    expect(gateway.emitSessionReady).toHaveBeenCalledWith('s1');
    expect(audit.log).toHaveBeenCalledWith(
      expect.objectContaining({ action: 'screen_session_requested' }),
    );
  });

  it('consent approve is idempotent when already armed', async () => {
    const view = await service.consent('d1', 's1', true);
    expect(view.consented).toBe(true);
    expect(view.status).toBe('live');
  });

  it('consent deny ends session and emits denied', async () => {
    prisma.screenSession.findUnique.mockResolvedValue({
      ...baseSession,
      consented: true,
    });
    const view = await service.consent('d1', 's1', false);
    expect(view.status).toBe('denied');
    expect(gateway.emitSessionDenied).toHaveBeenCalledWith('s1');
  });

  it('consent rejects other device', async () => {
    await expect(service.consent('other', 's1', true)).rejects.toBeInstanceOf(
      ForbiddenException,
    );
  });

  it('endAsParent ends a live session', async () => {
    prisma.screenSession.findUnique.mockResolvedValue({
      ...baseSession,
      consented: true,
    });
    const view = await service.endAsParent('f1', 's1', 'u1');
    expect(view.status).toBe('ended');
    expect(gateway.emitSessionEnded).toHaveBeenCalledWith('s1');
  });

  it('getForFamily enforces ownership', async () => {
    await service.getForFamily('f1', 's1');
    expect(devices.getForFamily).toHaveBeenCalledWith('f1', 'd1');
  });

  it('assertCanEmitFrame allows armed live sessions', async () => {
    await expect(service.assertCanEmitFrame('s1', 'd1')).resolves.toMatchObject({
      id: 's1',
      consented: true,
    });
  });

  it('assertCanEmitFrame rejects ended sessions', async () => {
    prisma.screenSession.findUnique.mockResolvedValue({
      ...baseSession,
      endedAt: new Date(),
    });
    await expect(service.assertCanEmitFrame('s1', 'd1')).rejects.toBeInstanceOf(
      ForbiddenException,
    );
  });

  it('consent after end throws', async () => {
    prisma.screenSession.findUnique.mockResolvedValue({
      ...baseSession,
      endedAt: new Date(),
    });
    await expect(service.consent('d1', 's1', true)).rejects.toBeInstanceOf(
      BadRequestException,
    );
  });
});
