import { cn } from '@/lib/utils';

const Console = ({ className }: { className?: string }) => {
	return (
		<div className={cn(className, 'text-xl grid place-items-center')}>
			Console
		</div>
	);
};

export default Console;
