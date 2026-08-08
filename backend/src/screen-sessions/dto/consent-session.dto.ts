import { IsBoolean } from 'class-validator';

export class ConsentSessionDto {
  @IsBoolean()
  approved!: boolean;
}
