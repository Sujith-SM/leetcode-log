import os
import argparse
from datetime import date

def create_solution_file(title, url, difficulty, tags, lang="py", status="Solved", code_content=None):
    today = date.today().isoformat()
    folder = difficulty.lower()
    os.makedirs(folder, exist_ok=True)

    # Map for language to file extension
    ext_map = {"py":"py", "java":"java", "cpp":"cpp", "kt":"kt", "kotlin":"kt", "js":"js"}
    ext = ext_map.get(lang.lower(), lang.lower())

    # File name = title with underscores
    file_name = title.lower().replace(" ", "_") + f".{ext}"
    file_path = os.path.join(folder, file_name)

    # Header for solution file
    header = f"""# Problem: {title}
# Link: {url}
# Difficulty: {difficulty}
# Tags: {tags}
# Date: {today}
# Status: {status}
"""

    # If code_content provided, use it; otherwise create minimal template
    if code_content:
        content = header + "\n" + code_content + "\n"
    else:
        if ext == "py":
            content = header + "\nclass Solution:\n    def solve(self):\n        pass\n"
        elif ext == "java":
            content = header + "\npublic class Solution {\n    public void solve() {\n        // Your code here\n    }\n}\n"
        elif ext == "cpp":
            content = header + "\nclass Solution {\npublic:\n    void solve() {\n        // Your code here\n    }\n};\n"
        else:
            content = header + f"\n// Your code here ({ext})\n"

    # Write solution file
    with open(file_path, "w", encoding="utf-8") as f:
        f.write(content)
    print(f"✅ Created {file_path}")

    # Update README
    row = f"| {today} | [{title}]({url}) | {difficulty} | {tags} | {status} | [code]({folder}/{file_name}) |\n"
    with open("README.md", "a", encoding="utf-8") as f:
        f.write(row)
    print("📘 Updated README.md")

if __name__ == "__main__":
    parser = argparse.ArgumentParser()
    parser.add_argument("--title", required=True, help="Problem title")
    parser.add_argument("--url", required=True, help="Problem link")
    parser.add_argument("--difficulty", required=True, choices=["Easy", "Medium", "Hard"])
    parser.add_argument("--tags", default="", help="Comma separated tags")
    parser.add_argument("--lang", default="py", help="File extension / language")
    parser.add_argument("--status", default="Solved", help="Solved/In Progress")
    parser.add_argument("--code-file", default=None, help="Path to a file containing your actual solution code")
    args = parser.parse_args()

    code_content = None
    if args.code_file:
        with open(args.code_file, "r", encoding="utf-8") as f:
            code_content = f.read()

    create_solution_file(args.title, args.url, args.difficulty, args.tags, args.lang, args.status, code_content)

