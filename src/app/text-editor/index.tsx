'use client';

import { cn } from '@/lib/utils';
import ActionBar from './action-bar';
import Editor from '@monaco-editor/react';
import { editor } from 'monaco-editor';
import { useRef } from 'react';

const TextEditor = ({ className }: { className?: string }) => {
	const textEditorRef = useRef<null | editor.IStandaloneCodeEditor>(null);

	const getTextEditorValue = () => {
		if (textEditorRef.current == null) {
			return;
		}

		console.log(textEditorRef.current.getValue());
	};

	return (
		<div className={cn(className, 'text-xl flex flex-col')}>
			<ActionBar />
			<div className="grow grid place-items-center">
				<Editor
					height="100%"
					defaultLanguage=""
					defaultValue="// some comment"
					onMount={(editor) => {
						textEditorRef.current = editor;
					}}
				/>
			</div>
		</div>
	);
};

export default TextEditor;
