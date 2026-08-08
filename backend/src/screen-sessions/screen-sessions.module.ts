import { Module } from '@nestjs/common';
import { CommandsModule } from '../commands/commands.module';
import { DevicesModule } from '../devices/devices.module';
import { ScreenGateway } from '../realtime/screen.gateway';
import { ScreenSessionsController } from './screen-sessions.controller';
import { ScreenSessionsService } from './screen-sessions.service';

@Module({
  imports: [DevicesModule, CommandsModule],
  controllers: [ScreenSessionsController],
  providers: [ScreenSessionsService, ScreenGateway],
  exports: [ScreenSessionsService],
})
export class ScreenSessionsModule {}
