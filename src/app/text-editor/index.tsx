import { cn } from '@/lib/utils';
import ActionBar from './action-bar';

const TextEditor = ({ className }: { className?: string }) => {
	return (
		<div className={cn(className, 'text-xl flex flex-col')}>
			<ActionBar />
			<div className="grow grid place-items-center">Text Editor</div>
		</div>
	);
};

export default TextEditor;
