import TextEditor from './text-editor';
import Console from './console';

export default function Home() {
	return (
		<main className="min-h-screen grid grid-cols-2">
			<TextEditor />
			<Console />
		</main>
	);
}
