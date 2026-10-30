import { IsIn, IsOptional } from 'class-validator';

export class CreateScreenSessionDto {
  /** 'mirror' = continuous live stream; 'screenshot' = one on-demand frame. */
  @IsOptional()
  @IsIn(['mirror', 'screenshot'])
  mode?: 'mirror' | 'screenshot';
}
