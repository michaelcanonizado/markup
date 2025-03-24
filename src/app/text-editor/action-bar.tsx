'use client';

import { useState } from 'react';

import { Button } from '@/components/ui/button';
import { cn } from '@/lib/utils';
import { Sun, Moon } from 'lucide-react';

const ActionBar = ({ className }: { className?: string }) => {
	const [isDarkMode, setIsDarkMode] = useState(false);

	const onClick = () => {
		setIsDarkMode((prevMode) => !prevMode);
		console.log(`Mode: ${isDarkMode}`);
	};

	return (
		<div className={cn(className, 'border-b p-4 flex justify-end')}>
			<div className="flex flex-row gap-4">
				<Button
					onClick={onClick}
					variant={'outline'}
					className="hover:cursor-pointer px-6"
				>
					{isDarkMode ? <Moon /> : <Sun />}
				</Button>
				<Button className="hover:cursor-pointer bg-primary text-primary-foreground px-6">
					Run
				</Button>
			</div>
		</div>
	);
};

export default ActionBar;
