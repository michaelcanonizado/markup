import { cn } from '@/lib/utils';
import React from 'react';

const Header = ({ className }: { className?: string }) => {
	return (
		<div className={cn(className, 'py-8')}>
			<h1 className="text-4xl font-bold">Markup</h1>
		</div>
	);
};

export default Header;
