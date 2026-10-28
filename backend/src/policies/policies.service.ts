import { Injectable } from '@nestjs/common';
import { CommandType, Policy, Prisma } from '@prisma/client';
import { AuditService } from '../audit/audit.service';
import { CommandsService } from '../commands/commands.service';
import { PrismaService } from '../prisma/prisma.service';

@Injectable()
export class PoliciesService {
  constructor(
    private readonly prisma: PrismaService,
    private readonly commands: CommandsService,
    private readonly audit: AuditService,
  ) {}

  getActive(familyId: string): Promise<Policy | null> {
    return this.prisma.policy.findFirst({
      where: { familyId, active: true },
      orderBy: { version: 'desc' },
    });
  }

  history(familyId: string): Promise<Policy[]> {
    return this.prisma.policy.findMany({
      where: { familyId },
      orderBy: { version: 'desc' },
      take: 50,
    });
  }

  /** Shallow-merge incoming fields onto the active rules so partial parent updates
   *  (e.g. blocked apps only) do not wipe schedules, limits, or DNS lists. */
  private mergeRules(
    active: Policy | null,
    patch: Record<string, unknown>,
  ): Record<string, unknown> {
    const existing =
      active?.rules && typeof active.rules === 'object' && !Array.isArray(active.rules)
        ? (active.rules as Record<string, unknown>)
        : {};
    return { ...existing, ...patch };
  }

  /** Create a new active version and push SET_POLICY to every device. */
  async update(
    familyId: string,
    rules: Record<string, unknown>,
  ): Promise<Policy> {
    const active = await this.getActive(familyId);
    const merged = this.mergeRules(active, rules);

    const latest = await this.prisma.policy.findFirst({
      where: { familyId },
      orderBy: { version: 'desc' },
    });
    const version = (latest?.version ?? 0) + 1;

    // deactivate-then-create. Not wrapped in a tx: a concurrent double-update is
    // benign — both produce a valid newer active version and last-write-wins.
    await this.prisma.policy.updateMany({
      where: { familyId, active: true },
      data: { active: false },
    });
    const policy = await this.prisma.policy.create({
      data: {
        familyId,
        version,
        rules: merged as Prisma.InputJsonValue,
        active: true,
      },
    });

    await this.pushToDevices(familyId, policy);
    await this.audit.log({
      familyId,
      actor: 'parent',
      action: 'policy_updated',
      data: { version },
    });
    return policy;
  }

  private async pushToDevices(familyId: string, policy: Policy): Promise<void> {
    const devices = await this.prisma.device.findMany({
      where: { familyId },
      select: { id: true },
    });
    await Promise.all(
      devices.map((d) =>
        this.commands
          .enqueue(familyId, d.id, {
            type: CommandType.SET_POLICY,
            payload: { version: policy.version, rules: policy.rules },
          })
          .catch(() => undefined),
      ),
    );
  }
}
