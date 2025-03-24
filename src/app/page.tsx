import {
	ResizableHandle,
	ResizablePanel,
	ResizablePanelGroup,
} from '@/components/ui/resizable';

import TextEditor from './text-editor';
import Console from './console';

export default function Home() {
	return (
		<main className=" h-screen px-8 pb-8 flex flex-col">
			<div className="py-8">
				<h1 className="text-4xl font-bold">Markup</h1>
			</div>
			<ResizablePanelGroup
				direction="horizontal"
				className="growrounded-lg border"
			>
				<ResizablePanel defaultSize={50}>
					<TextEditor className="text-xl w-full h-full  grid place-items-center" />
				</ResizablePanel>
				<ResizableHandle withHandle />
				<ResizableHandle />
				<ResizablePanel defaultSize={50}>
					<Console className="text-xl w-full h-full  grid place-items-center" />
				</ResizablePanel>
			</ResizablePanelGroup>
		</main>
	);
}
