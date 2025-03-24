import { Button } from '@/components/ui/button';
import { cn } from '@/lib/utils';

const ActionBar = ({ className }: { className?: string }) => {
	return (
		<div className={cn(className, 'border-b p-4 flex justify-end')}>
			<Button className="hover:cursor-pointer bg-primary text-primary-foreground px-6">
				Run
			</Button>
		</div>
	);
};

export default ActionBar;
