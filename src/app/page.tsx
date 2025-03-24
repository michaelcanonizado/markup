import {
	ResizableHandle,
	ResizablePanel,
	ResizablePanelGroup,
} from '@/components/ui/resizable';

import TextEditor from './text-editor';
import Console from './console';
import Header from './header';

export default function Home() {
	return (
		<main className=" h-screen px-8 pb-8 flex flex-col">
			<Header />
			<ResizablePanelGroup
				direction="horizontal"
				className="growrounded-lg border"
			>
				<ResizablePanel defaultSize={50}>
					<TextEditor className="w-full h-full" />
				</ResizablePanel>
				<ResizableHandle withHandle />
				<ResizableHandle />
				<ResizablePanel defaultSize={50}>
					<Console className="w-full h-full" />
				</ResizablePanel>
			</ResizablePanelGroup>
		</main>
	);
}
