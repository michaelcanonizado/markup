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
