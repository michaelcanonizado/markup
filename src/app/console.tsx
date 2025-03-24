import { cn } from '@/lib/utils';
import React from 'react';

const Console = ({ className }: { className: string }) => {
	return <div className={cn(className, '')}>Console</div>;
};

export default Console;
