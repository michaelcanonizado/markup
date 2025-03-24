import { cn } from '@/lib/utils';

const TextEditor = ({ className }: { className?: string }) => {
	return <div className={cn(className, '')}>Text Editor</div>;
};

export default TextEditor;
